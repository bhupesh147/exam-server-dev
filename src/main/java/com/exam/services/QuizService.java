package com.exam.services;

import java.util.List;
import java.util.Set;

import com.exam.entity.exam.model.Category;
import com.exam.entity.exam.model.Quiz;

public interface QuizService {

	public Quiz addQuiz(Quiz quiz);
	public Quiz updateQuiz(Quiz quiz);
	public Set<Quiz> getQuizes();
	public Quiz getQuiz(Long quizId);
	public void deleteQuiz(Long quizId);
	public List<Quiz> getQuizzesOfCategory(Category category);
	public List<Quiz> getActiveQuizzes();
	public List<Quiz> getActiveQuizzesOfCategory(Category c);
}
