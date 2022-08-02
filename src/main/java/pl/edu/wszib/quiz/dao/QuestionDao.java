package pl.edu.wszib.quiz.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.quiz.model.Question;

@Repository
public interface QuestionDao extends CrudRepository<Question, Integer> {
    Question findFirstByQuestionText(String questionText);

}
