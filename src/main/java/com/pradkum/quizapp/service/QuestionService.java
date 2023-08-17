package com.pradkum.quizapp.service;

import com.pradkum.quizapp.model.Question;
import com.pradkum.quizapp.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;

    public ResponseEntity<List<Question>> getAllQuestions() {
        try {
            return new ResponseEntity<>(questionDao.findAll(), HttpStatus.OK);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public List<Question> getQuestionsByDifficulty(String difficultyLevel) {
        return questionDao.findByDifficultyLevel(difficultyLevel);
    }

    // TODO: Return HTTP status code
    public ResponseEntity<String> addQuestion(Question question) {
        questionDao.save(question);
        return new ResponseEntity<>("success", HttpStatus.CREATED);
    }
}
