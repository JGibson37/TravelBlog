package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoryController {

    private final CountryRepository countryRepo;
    private final HashtagRepository hashtagRepo;

    public CategoryController(CountryRepository countryRepo, HashtagRepository hashtagRepo) {
        this.countryRepo = countryRepo;
        this.hashtagRepo = hashtagRepo;
    }

    @RequestMapping({"/category"})
    public String routeToCountries(Model model){
        model.addAttribute("countries",countryRepo.findAll());
        model.addAttribute("hashtags",hashtagRepo.findAll());
        return "category-template";
    }


}
