package pl.edu.wszib.quiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pl.edu.wszib.quiz.model.QuestionForm;
import pl.edu.wszib.quiz.model.Score;
import pl.edu.wszib.quiz.service.QuizService;


@Controller
public class QuizController {

    @Autowired
    Score score;
    @Autowired
    QuizService quizService;

    Boolean submitted = false;

    @ModelAttribute("score")
    public Score getScore() {
        return score;
    }



    @PostMapping ("categories")
    public String showCategories() {
        return "categories";


    }

    @PostMapping("quiz")
    public String quiz(@RequestParam String username, Model model, RedirectAttributes ra) {
        if(username.equals("")) {
            ra.addFlashAttribute("warning", "Imię nie może być puste");
            return "redirect:/";
        }

        submitted = false;
        score.setUsername(username);

        QuestionForm questionForm = quizService.getQuestions();
        model.addAttribute("questionForm", questionForm);

        return "quizPage";
    }

    @PostMapping("submit")

    public String submit(@ModelAttribute QuestionForm questionForm, Model model) {
        if(!submitted) {
            score.setOverallScore(quizService.getScore(questionForm));
            quizService.saveUrScore(score);
            submitted = true;
        }

        return "scorePage";
    }




}
