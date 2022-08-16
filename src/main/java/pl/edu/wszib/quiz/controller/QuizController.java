package pl.edu.wszib.quiz.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class QuizController {

    @PostMapping ("categories")
    public String showCategories() {
        return "categories";
    }




}
