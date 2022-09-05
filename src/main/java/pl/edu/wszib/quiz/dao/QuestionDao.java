package pl.edu.wszib.quiz.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.quiz.model.Question;

import java.util.Collection;
import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {
    Question findFirstByQuestionText(String questionText);

    @Query("SELECT q FROM Question q WHERE q.category = :category ")
    Collection<Question> findAllQuestionsByCategory(@Param("category") String category);



}
