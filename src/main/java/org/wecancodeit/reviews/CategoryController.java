package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoryController {



    @RequestMapping({"","/"})
    public String routeToCountries(){
        return "redirect:countries";
    }


}
