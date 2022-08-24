package pl.edu.wszib.quiz.dao;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.edu.wszib.quiz.model.Score;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class ScoreDaoTest {

    public static final String USERNAME_1 = "Pierwszy Gracz";
    public static final String USERNAME_2 = "Drugi Gracz";
    public static final Integer OVERALL_SCORE_1 = 2;
    public static final Integer OVERALL_SCORE_2 = 3;

    @Autowired
    ScoreDao scoreDao;

    @BeforeEach
    void setUp() {
        Score score1 = new Score(1, USERNAME_1, OVERALL_SCORE_1);
        Score score2 = new Score(2, USERNAME_2, OVERALL_SCORE_2);

        assertNull(score1.getId());
        assertNull(score2.getId());

        scoreDao.save(score1);
        scoreDao.save(score2);

        assertNotNull(score1.getId());
        assertNotNull(score2.getId());

    }

    @Test  // po próbie dopasowania z przykładu Selected Colors narazie to nie działa : (
    void testFetchData() {
       Score score = scoreDao.findFirstByOverallScore(OVERALL_SCORE_1);
       assertEquals(OVERALL_SCORE_1, score.getOverallScore() , "komunikat testu");
    }
}
