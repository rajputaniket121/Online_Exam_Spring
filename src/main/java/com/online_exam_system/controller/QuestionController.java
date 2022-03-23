package com.online_exam_system.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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

import com.online_exam_system.model.Question;
import com.online_exam_system.model.Quiz;
import com.online_exam_system.service.QuestionService;
import com.online_exam_system.service.QuizService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class QuestionController {
	
	@Autowired
	private QuestionService questionService;
	
	@Autowired
	private QuizService quizService;
	
	//add Question
	@PostMapping("/question")
	public ResponseEntity<Question> addQuestion(@RequestBody Question question)
	{
		Question question2 = this.questionService.addQuestion(question);
		return ResponseEntity.ok(question2);
	}
	
	//update Question
	@PutMapping("/question")
	public ResponseEntity<Question> updateQuestion(@RequestBody Question question)
	{
		Question question2 = this.questionService.addQuestion(question);
		return ResponseEntity.ok(question2);
	}
	
	//get question
	@GetMapping("/question/{qId}")
	 public Question getQuestion(@PathVariable("qId") long qId)
	 {
		 return questionService.getQuestion(qId);
	 }
	
	//get all Question
	@GetMapping("/question")
	public ResponseEntity<Set<Question>> getQuestions()
	{
		return ResponseEntity.ok(this.questionService.getQuestions());
	}
	
	//delete Question
	@DeleteMapping("/question/{qId}")
	public void deleteQuestion(@PathVariable("qId") long qId)
	{
		this.questionService.deleteQuestion(qId);
	}
	
	//get question based on quiz id
	@GetMapping("/question/quiz/{qId}")
	public ResponseEntity<List<Question>> getQuestionOfQuiz(@PathVariable("qId") Long qId)
	{
//		Quiz quiz = new Quiz();
//		quiz.setqId(qId);
//		Set<Question> questionOfQuiz = this.questionService.getQuestionsOfQuiz(quiz);
//		return ResponseEntity.ok(questionOfQuiz);
		Quiz quiz= this.quizService.getQuiz(qId);
		Set<Question> questions = quiz.getQuestions();
		List<Question> list = new ArrayList<>(questions);
		if(list.size()>Integer.parseInt(quiz.getNumberOfQuestions()))
		{
			list=list.subList(0, Integer.parseInt(quiz.getNumberOfQuestions()+1));
		}
		Collections.shuffle(list);
		return ResponseEntity.ok(list);
	}
	
	
	
}
