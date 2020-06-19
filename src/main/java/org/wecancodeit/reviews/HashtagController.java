package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HashtagController {

    private HashtagRepository hashtagRepo;

    public HashtagController(HashtagRepository hashtagRepo) {
        this.hashtagRepo = hashtagRepo;
    }

    @GetMapping("hashtags/{id}")
    public String showSingleHashtag(@PathVariable Long id, Model model){
        model.addAttribute("hashtag",hashtagRepo.findById(id).get());
        return "hashtag-template";
    }

    @PostMapping("hashtags/add")
    public String addHashtag(String hashtag){
        Hashtag hashtagToAdd = new Hashtag(hashtag);
        hashtagRepo.save(hashtagToAdd);
        return "redirect:/";
    }
}
