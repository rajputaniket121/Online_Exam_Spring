package com.online_exam_system.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online_exam_system.model.Question;
import com.online_exam_system.model.Quiz;
import com.online_exam_system.repository.QuestionRepository;
import com.online_exam_system.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService{
	@Autowired
	private QuestionRepository questionRepository;
	
	@Override
	public Question addQuestion(Question question) {
		// TODO Auto-generated method stub
		return this.questionRepository.save(question);
	}

	@Override
	public Question updateQuestion(Question question) {
		// TODO Auto-generated method stub
		return this.questionRepository.save(question);
	}

	@Override
	public Set<Question> getQuestions() {
		// TODO Auto-generated method stub
		return new HashSet<>(this.questionRepository.findAll());
	}

	@Override
	public Question getQuestion(long qid) {
		// TODO Auto-generated method stub
		return questionRepository.findQuestionByQid(qid);
	}

	@Override
	public Set<Question> getQuestionsOfQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		return this.questionRepository.findByQuiz(quiz);
	}

	@Override
	public void deleteQuestion(long qid) {
		// TODO Auto-generated method stub
		this.questionRepository.deleteById(qid);
		
	}
	
	

	

}
