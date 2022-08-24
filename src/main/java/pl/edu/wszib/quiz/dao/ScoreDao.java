package pl.edu.wszib.quiz.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.quiz.model.Score;

@Repository
public interface ScoreDao extends JpaRepository<Score, Integer> {
    Score findFirstByOverallScore(Integer score);

}
