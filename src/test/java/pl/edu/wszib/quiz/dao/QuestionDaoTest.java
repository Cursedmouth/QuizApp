package pl.edu.wszib.quiz.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.edu.wszib.quiz.model.Question;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class QuestionDaoTest {

    public static final String QUESTION_TEXT1 = "pytanie o muzyke";
    public static final String category1 = "muzyka";
    public static final String QUESTION_TEXT2 = "pytanie o sport";
    public static final String category2 = "muzyka";

    public static final int TOTAL_QUESTIONS = 20;

    @Autowired
    QuestionDao questionDao;

    @BeforeEach
    void setUp() {
        Question question1 = new Question(1,QUESTION_TEXT1, category1, "OPTION_A", "OPTION_B", "OPTION_C", "OPTION_D", 3, -1);
        Question question2 = new Question(2,QUESTION_TEXT2, category2, "OPTION_A", "OPTION_B", "OPTION_C", "OPTION_D", 2, -1);

//        assertNull(question1.getQuestionId());
//        assertNull(question2.getQuestionId());

        questionDao.save(question1);
        questionDao.save(question2);

        assertNotNull(question1.getQuestionId());
        assertNotNull(question2.getQuestionId());
    }

    @Test
    void testFetchData() {
        Question question = questionDao.findFirstByQuestionText(QUESTION_TEXT2);
        assertEquals(QUESTION_TEXT1, question.getQuestionText() , "Znaleziono nieprawidłowe pytanie");
    }

    @Test
    void testFetchAllData() {
        Collection questions = (Collection) questionDao.findAll();
        assertEquals(TOTAL_QUESTIONS, questions.size() , "Nieprawidłowa liczba pytań");
    }

}