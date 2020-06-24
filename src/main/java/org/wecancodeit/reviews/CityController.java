package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CityController {

    CityStorage cityStorage;

    public CityController(CityStorage cityStorage) {
        this.cityStorage = cityStorage;
    }

    @RequestMapping("cities/{name}")
    public String showSingleCity(@PathVariable String name, Model model) {
        model.addAttribute("city", cityStorage.findCityByName(name));
        return "cities-template";
    }


}
