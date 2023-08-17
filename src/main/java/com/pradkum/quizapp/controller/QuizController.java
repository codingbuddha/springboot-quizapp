package com.pradkum.quizapp.controller;

import com.pradkum.quizapp.model.Response;
import com.pradkum.quizapp.model.QuestionWrapper;
import com.pradkum.quizapp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "quiz")
public class QuizController {

    @Autowired
    QuizService quizService;
    @PostMapping("create") // URL: /quiz/create?difficulty=medium&numQ=5&title=MQuiz
    public ResponseEntity<String> createQuiz(@RequestParam String difficulty,
                                             @RequestParam int numQ,
                                             @RequestParam String title) {
        return quizService.createQuiz(difficulty, numQ, title);
    }

    /**
     * To get the quiz created with id
     * @param id - ID of quiz
     * @return - List of questions
     */
    @GetMapping("get/{id}") // URL: /quiz/get/3
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@PathVariable Integer id) {
        return quizService.getQuizQuestions(id);
    }

    @PostMapping("submit/{id")
    public ResponseEntity<Integer> submitQuiz(@PathVariable Integer id, @RequestBody List<Response> responses) {
        return quizService.calculateResult(id, responses);
    }
}
