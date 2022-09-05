package pl.edu.wszib.quiz.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @Value("${app.title.homePage}")
    private String title;

    @GetMapping("/")
    public String showHomePage(Model model) {
        model.addAttribute("title", title);
        return "homePage";
    }
}
