package pl.edu.wszib.quiz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import pl.edu.wszib.quiz.dao.QuestionDao;
import pl.edu.wszib.quiz.dao.ScoreDao;
import pl.edu.wszib.quiz.model.Question;
import pl.edu.wszib.quiz.model.QuestionForm;
import pl.edu.wszib.quiz.model.Score;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

@Service
public class QuizService {

    @Autowired
    Question question;
    @Autowired
    QuestionForm questionForm;
    @Autowired
    QuestionDao questionDao;
    @Autowired
    Score score;
    @Autowired
    ScoreDao scoreDao;

    public QuestionForm getQuestions() {
        List<Question> allQuestions = questionDao.findAll();
        List<Question> questionList = new ArrayList<Question>();

        Random random = new Random();

        for(int i=0; i<5; i++) {
            int randomQuestion = random.nextInt(allQuestions.size());
            questionList.add(allQuestions.get(randomQuestion));
            allQuestions.remove(randomQuestion);

        }

        questionForm.setQuestions(questionList);

        return questionForm;


    }



    public int getScore(QuestionForm questionForm) {
        int correct = 0;

        for(Question question: questionForm.getQuestions())
            if(Objects.equals(question.getAnswer(), question.getChose()))
                correct++;

        return correct;
    }

    public void saveUrScore(Score score) {
        Score saveScore = new Score();
        saveScore.setUsername(score.getUsername());
        saveScore.setOverallScore(score.getOverallScore());
        scoreDao.save(saveScore);
    }

    public List<Score> getTopScore() {
        List<Score> scoreList = scoreDao.findAll(Sort.by(Sort.Direction.DESC, "overallScore"));

        return scoreList;
    }
}
