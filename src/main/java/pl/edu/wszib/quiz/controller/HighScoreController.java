package pl.edu.wszib.quiz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HighScoreController {


    @GetMapping("highscore")
    public String showHighScore() {
        return "highscore";
    }
}
