package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CountryController {

    private CountryStorage countryStorage;
    private CountryRepository countryRepo;


    public CountryController(CountryStorage countryStorage,CountryRepository countryRepo) {
        this.countryStorage = countryStorage;
        this.countryRepo=countryRepo;

    }

    @RequestMapping("country/{name}")
    public String showSingleCountry(@PathVariable String name, Model model) {
        model.addAttribute("country", countryStorage.getCountryByName(name));
        model.addAttribute("countries", countryStorage.getCountries());
        return "country-template";
    }
    @RequestMapping("homepage")
    public String showAllCountries(Model model){
        model.addAttribute("countries", countryStorage.getCountries());
        return "category-template";
    }


}
