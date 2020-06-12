package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class CityController {

    Map<String,City> cities = new HashMap<>();



    public CityController(){
        cities.put("Bruce Peninsula",new City("Bruce Peninsula","5 / 5","Bruce Peninsula National Park","Fish & Chip Place","The Bruce Peninsula is an astounding area to visit if you enjoy hiking and\n" +
                "      nature. The winding pine forest trails and towering cliffs into crystal\n" +
                "      clear water demand you explore them. After exerting yourself in your\n" +
                "      travels, The Fish And Chip Place serves amazing white-fish tacos (And I\n" +
                "      don't even like fish!"));
    }

    @RequestMapping("cities/{cityName}")
    public String showSingleCity(@PathVariable String cityName, Model model){
      model.addAttribute("city",cities.get(cityName));
      return "cities-template";
    }

}
