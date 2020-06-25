package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CityController {

    private CityStorage cityStorage;
    private CountryRepository countryRepo;
    private HashtagRepository hashtagRepo;

    public CityController(CityStorage cityStorage,CountryRepository countryRepo, HashtagRepository hashtagRepo) {
        this.cityStorage = cityStorage;
        this.countryRepo= countryRepo;
        this.hashtagRepo=hashtagRepo;
    }

    @RequestMapping("cities/{name}")
    public String showSingleCity(@PathVariable String name, Model model) {
        model.addAttribute("countries",countryRepo.findAll());
        model.addAttribute("city", cityStorage.findCityByName(name));
        model.addAttribute("hashtags",hashtagRepo.findAll());
        return "cities-template";
    }


}
