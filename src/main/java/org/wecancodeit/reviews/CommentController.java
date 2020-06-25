package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class CommentController {
    private CommentRepository commentRepo;
    private CommentStorage commentStorage;
    private CityStorage cityStorage;
    private CountryRepository countryRepo;


    public CommentController(CommentRepository commentRepo, CommentStorage commentStorage, CityStorage cityStorage, CountryRepository countryRepo) {
        this.commentRepo = commentRepo;
        this.commentStorage = commentStorage;
        this.cityStorage = cityStorage;
        this.countryRepo=countryRepo;
    }

    @RequestMapping("comment/{comment}")
    public String showSingleComment(@PathVariable String comment, Model model) {
        model.addAttribute("countries",countryRepo.findAll());
        model.addAttribute("comment", commentStorage.findCommentByComment(comment));
        return "city-template";
    }

    @PostMapping("comments/add")
    public String addComment(String comment, String cityName) {
        Comment commentToAdd = new Comment(comment);
        commentRepo.save(commentToAdd);
        City city = cityStorage.findCityByName(cityName);
        city.addComment(commentToAdd);
        cityStorage.save(city);
        return "redirect:/cities/" + cityName;
    }
    @GetMapping("comment/{id}")
    public String showSingleComment(@PathVariable Long id, Model model) {
        model.addAttribute("comment", commentRepo.findById(id).get());
        return "city-template";
    }
}

