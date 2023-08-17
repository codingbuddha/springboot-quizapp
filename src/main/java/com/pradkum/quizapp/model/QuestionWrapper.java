package com.pradkum.quizapp.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data // With lombok you don't need getters and setters
public class QuestionWrapper { // Quiz Object that needs to sent except answer

    public QuestionWrapper(Integer id, String questionTitle, String option1, String option2, String option3, String option4) {
        this.id = id;
        this.questionTitle = questionTitle;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
    }

    private Integer id; // Primary key
    private String questionTitle; // This name should be same as column in snake casing: question_title
    private String option1;
    private String option2;
    private String option3;
    private String option4;
}
