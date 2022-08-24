package pl.edu.wszib.quiz.model;

import javax.persistence.*;


@Entity
@Table(name = "scores")
public class Score {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private Integer overallScore = 0;

    public Score() {
    }

    public Score(Integer id, String username, Integer overallScore) {
        this.id = id;
        this.username = username;
        this.overallScore = overallScore;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getOverallScore() {
        return overallScore;
    }

    public void setOverallScore(Integer overallScore) {
        this.overallScore = overallScore;
    }
}
