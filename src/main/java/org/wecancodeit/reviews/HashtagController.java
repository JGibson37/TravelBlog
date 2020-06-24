package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HashtagController {

    private HashtagRepository hashtagRepo;
    private HashtagStorage hashtagStorage;
    private CityStorage cityStorage;

    public HashtagController(HashtagRepository hashtagRepo,HashtagStorage hashtagStorage,CityStorage cityStorage) {
        this.hashtagRepo = hashtagRepo;
        this.hashtagStorage = hashtagStorage;
        this.cityStorage = cityStorage;
    }

//    @GetMapping("hashtags/{id}")
//    public String showSingleHashtag(@PathVariable Long id, Model model) {
//        model.addAttribute("hashtag", hashtagRepo.findById(id).get());
//        return "hashtag-template";
//    }

    @RequestMapping("hashtag/{hashtag}")
    public String showSingleHashTag(@PathVariable String hashtag, Model model) {
        model.addAttribute("hashtag", hashtagStorage.findHashtagByHashtag(hashtag));
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
    @GetMapping("hashtags/{id}")
    public String showSingleHashtag(@PathVariable Long id, Model model) {
        model.addAttribute("hashtag", hashtagRepo.findById(id).get());
        return "hashtag-template";
    }
}
