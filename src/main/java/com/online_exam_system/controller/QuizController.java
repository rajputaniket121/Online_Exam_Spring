package com.online_exam_system.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online_exam_system.model.Quiz;
import com.online_exam_system.service.QuizService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class QuizController {
	 @Autowired
	 private QuizService quizService;
	 
	 //add quiz service
	 @PostMapping("/quiz")
	 public ResponseEntity<Quiz> addQuiz(@RequestBody Quiz quiz)
	 {
		 return ResponseEntity.ok(this.quizService.addQuiz(quiz));
	 }
	 
	 //update quiz
	 @PutMapping("/quiz")
	 public ResponseEntity<Quiz> updateQuiz(@RequestBody Quiz quiz)
	 {
		 return ResponseEntity.ok(this.quizService.addQuiz(quiz));
	 }
	 
	 //Get Quizes
	 @GetMapping("/quiz")
	 public ResponseEntity<Set<Quiz>> getCourses()
	{
		return ResponseEntity.ok(this.quizService.getQuizzes());
	}
	 
	 //get single Quiz 
	 @GetMapping("/quiz/{qId}")
	 public Quiz getQuiz(@PathVariable("qId") long qId)
	 {
		 return this.quizService.getQuiz(qId);
	 }
	 
	 //Delete Quiz
	 @DeleteMapping("/quiz/{qId}")
	 public void deleteQuiz(@PathVariable("qId") Long qId)
	 {
		 this.quizService.deleteQuiz(qId);
	 }

}
