package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CountryController {

    CountryStorage countryStorage;

    public CountryController(CountryStorage countryStorage) {
        this.countryStorage = countryStorage;

    }

    @RequestMapping("country/{name}")
    public String showSingleCountry(@PathVariable String name, Model model) {
        model.addAttribute("country", countryStorage.getCountryByName(name));
        model.addAttribute("countries", countryStorage.getCountries());
        return "country-template";
    }
    @RequestMapping("countries")
    public String showAllCountries(Model model){
        model.addAttribute("countries", countryStorage.getCountries());
        return "category-template";
    }

}
