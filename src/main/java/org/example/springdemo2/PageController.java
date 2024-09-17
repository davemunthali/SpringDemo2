package org.example.springdemo2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PageController {
    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/about")
    public String about(Model model){
        model.addAttribute("message", "Hello world");
        return "about";
    }
    @GetMapping("/contact")
    public String contact(Model model){
        model.addAttribute("numbers", List.of("767677","8767676","889897"));
        return "contact";
    }
}
