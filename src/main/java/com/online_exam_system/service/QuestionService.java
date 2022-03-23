package com.online_exam_system.service;

import java.util.Set;

import com.online_exam_system.model.Question;
import com.online_exam_system.model.Quiz;

public interface QuestionService {
	public Question addQuestion(Question question);
	public Question updateQuestion(Question question);
	public Set<Question> getQuestions();
	public Question getQuestion(long qid);
	public void deleteQuestion(long qid);
	public Set<Question> getQuestionsOfQuiz(Quiz quiz);


	

}
