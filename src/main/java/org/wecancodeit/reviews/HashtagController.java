package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HashtagController {

    private HashtagRepository hashtagRepo;
    private CityStorage cityStorage;

    public HashtagController(HashtagRepository hashtagRepo, CityStorage cityStorage) {
        this.hashtagRepo = hashtagRepo;
        this.cityStorage = cityStorage;
    }

    @GetMapping("hashtags/{id}")
    public String showSingleHashtag(@PathVariable Long id, Model model) {
        model.addAttribute("hashtag", hashtagRepo.findById(id).get());
        return "hashtag-template";
    }

    @PostMapping("hashtags/add")
    public String addHashtag(String hashtag, String cityName) {
        Hashtag hashtagToAdd = new Hashtag(hashtag);
        hashtagRepo.save(hashtagToAdd);
        City city = cityStorage.findCityByName(cityName);
        city.addHashtag(hashtagToAdd);
        cityStorage.save(city);
        return "redirect:/cities/" + cityName;
    }
}
