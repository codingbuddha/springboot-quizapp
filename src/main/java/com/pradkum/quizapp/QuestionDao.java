package com.pradkum.quizapp;

import com.pradkum.quizapp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> { // Table name, Primary key
    List<Question> findByDifficultyLevel(String difficultyLevel);

    @Query(value = "SELECT * FROM question q WHERE q.difficulty_level=:difficulty ORDER BY RANDOM() LIMIT :numQ", nativeQuery = true)
    List<Question> findRandomQuestionsByDifficulty(String difficulty, int numQ);
}
