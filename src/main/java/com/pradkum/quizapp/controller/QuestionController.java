package com.pradkum.quizapp.controller;

import com.pradkum.quizapp.model.Question;
import com.pradkum.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping(path = "allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping(path = "difficulty/{difficulty}")
    public List<Question> getQuestionsByDifficulty(@PathVariable String difficulty) {
        return questionService.getQuestionsByDifficulty(difficulty);
    }

    /**
     * Client sends question data in JSON format
    */
    @PostMapping(path = "add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question) {
        return questionService.addQuestion(question);
    }
}
