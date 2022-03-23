package com.online_exam_system.service;

import java.util.Set;

import com.online_exam_system.model.Quiz;

public interface QuizService {
	public Quiz addQuiz(Quiz quiz);
	public Quiz updateQuiz(Quiz quiz);
	public Set<Quiz> getQuizzes();
	public Quiz getQuiz(long quizid);
	public void deleteQuiz(long quizid);
}
