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

        @RequestMapping("cities/{cityName}")
        public String showSingleCity ( @PathVariable String cityName, Model model){
            model.addAttribute("city", cityStorage.findCityByName(cityName));
            return "cities-template";
        }

    }
