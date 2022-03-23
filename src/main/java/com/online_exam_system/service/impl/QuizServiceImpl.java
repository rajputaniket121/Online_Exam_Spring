package com.online_exam_system.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online_exam_system.model.Quiz;
import com.online_exam_system.repository.QuizRepository;
import com.online_exam_system.service.QuizService;

@Service
public class QuizServiceImpl implements QuizService{
	@Autowired
	QuizRepository quizRepository;

	@Override
	public Quiz addQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		return this.quizRepository.save(quiz);
	}

	@Override
	public Quiz updateQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		return this.quizRepository.save(quiz);
	}

	@Override
	public Set<Quiz> getQuizzes() {
		// TODO Auto-generated method stub
		return new HashSet<>(quizRepository.findAll());
	}

	@Override
	public Quiz getQuiz(long quizid) {
		// TODO Auto-generated method stub
		return this.quizRepository.findById(quizid).get();
	}

	@Override
	public void deleteQuiz(long quizid) {
		// TODO Auto-generated method stub
		Quiz quiz = new Quiz();
		quiz.setqId(quizid);
		this.quizRepository.delete(quiz);
	}

}
