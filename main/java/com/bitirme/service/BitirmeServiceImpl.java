package com.bitirme.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitirme.dao.ExamRepository;
import com.bitirme.exception.ExamNotFoundException;
import com.bitirme.model.Exam;

@Service
public class BitirmeServiceImpl implements BitirmeService {

	private ExamRepository examRepository;
	
	@Autowired
	public void setExamRepository(ExamRepository examRepository) {
		this.examRepository = examRepository;
	}
	@Override
	public List<Exam> findAll(){
		return examRepository.findAll();
	}

	@Override
	public List<Exam> findExams(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Exam findById(String id) throws ExamNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createExam(Exam exam) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateExam(Exam exam) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteExam(Long id) {
		// TODO Auto-generated method stub

	}

}
