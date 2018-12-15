package com.bitirme.dao;

import java.util.List;

import com.bitirme.model.Candidate;

public interface CandidateRepository {
	List<Candidate> findAll();
	Candidate findById(Long Id);
	List<Candidate> findByName(String name);
	List<Candidate> findByJob(String title);
	List<Candidate> findByExamId(Long ExamId);
	void create(Candidate candidate);
	Candidate update(Candidate candidate);
	void delete(Long id);
}
