package pl.edu.wszib.quiz.model;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer questionId;
    private String questionText;
    private String category; // chyba do wycięcia category stąd <=======
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private Integer answer;
    private Integer chose;

    @ManyToMany
    @JoinTable(name = "question_category", joinColumns = @JoinColumn(name = "questionId"),
            inverseJoinColumns = @JoinColumn(name = "categoryId"))
    private Set<Category> categories;

    public Question() {
    }

    // wycięte ( Integer questionId, <- ponieważ GenerationType.AUTO ) << jednak nie wycięte bo generation type zmieniony na identity


    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public Question(Integer questionId, String questionText, String category, String optionA, String optionB, String optionC, String optionD, Integer answer, Integer chose) {
        this.questionId = questionId;
        this.questionText = questionText;
        this.category = category;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.answer = answer;
        this.chose = chose;

    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public Integer getAnswer() {
        return answer;
    }

    public void setAnswer(Integer answer) {
        this.answer = answer;
    }

    public Integer getChose() {
        return chose;
    }

    public void setChose(Integer chose) {
        this.chose = chose;
    }


}
