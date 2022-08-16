package pl.edu.wszib.quiz.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.quiz.model.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {
    Question findFirstByQuestionText(String questionText);

}
