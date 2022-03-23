package com.online_exam_system.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online_exam_system.model.Question;
import com.online_exam_system.model.Quiz;


public interface QuestionRepository extends JpaRepository<Question, Long> {

	Set<Question> findByQuiz(Quiz quiz);
	Question findQuestionByQid(long qid);
}
