package com.example.Freelancer;

import com.example.Freelancer.Model.Messages;
import com.example.Freelancer.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @Autowired private HomeService homeService;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("messages", new Messages());
        model.addAttribute("items", homeService.getItems());
        return "index";
    }

    @PostMapping("/messages")
    public String messages(Model model, @ModelAttribute Messages messages) {
        model.addAttribute("messages", messages);
        return "messages";
    }
}
