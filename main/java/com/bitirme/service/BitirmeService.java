package com.bitirme.service;

import java.util.List;

import com.bitirme.exception.ExamNotFoundException;
import com.bitirme.model.Exam;

public interface BitirmeService {
	public List<Exam> findAll();
	List<Exam> findExams(String name);
	Exam findById(String id) throws ExamNotFoundException;
	void createExam(Exam exam);
	void updateExam(Exam exam);
	void deleteExam(Long id);
	
	
}
