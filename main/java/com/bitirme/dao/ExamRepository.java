package com.bitirme.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bitirme.model.Exam;

public interface ExamRepository extends CrudRepository<Exam, Long>{
	List<Exam> findAll();
	/*Exam findById(String Id);
	List<Exam> findByName(String name);
	List<Exam> findByJob(String job);
	void create(Exam exam);
	Exam update(Exam exam);
	void delete(String id);*/
}
