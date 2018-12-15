package com.bitirme.dao.jpa;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.bitirme.dao.ExamRepository;
import com.bitirme.model.Exam;

@Repository("examRepository")
public class ExamRepositoryJpaImpl implements ExamRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

/*	@Override
	public List<Exam> findAll() {
		return entityManager.createQuery("from EXAMTABLE", Exam.class).getResultList();
	}

	@Override
	public Exam findById(String Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Exam> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Exam> findByJob(String job) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(Exam exam) {
		// TODO Auto-generated method stub

	}

	@Override
	public Exam update(Exam exam) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub

	}*/

	@Override
	public <S extends Exam> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Exam> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Exam> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Exam> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Exam entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Exam> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Exam> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
