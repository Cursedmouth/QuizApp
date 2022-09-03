package pl.edu.wszib.quiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.edu.wszib.quiz.model.Score;
import pl.edu.wszib.quiz.service.QuizService;

import java.util.List;


@Controller
public class HighScoreController {

    @Autowired
    QuizService quizService;

    @GetMapping("highscore")
    public String showHighScore(Model model) {
        List<Score> scoreList = quizService.getTopScore();
        model.addAttribute("scoreList", scoreList);
        return "highscore";
    }
}
