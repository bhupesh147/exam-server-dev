package com.exam.repo;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.entity.exam.model.Question;
import com.exam.entity.exam.model.Quiz;

public interface QuestionRepository extends JpaRepository<Question,Long> {

	Set<Question> findByQuiz(Quiz quiz);

}
