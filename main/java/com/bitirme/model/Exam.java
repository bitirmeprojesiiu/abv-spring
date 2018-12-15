package com.bitirme.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EXAMTABLE")
public class Exam implements Serializable{
	private static final long serialVersionUID = -3009157732242241606L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="examid")
	private String id;
	
	@Column(name="examname")
	private String name;
	
	@Column(name="jobdescription")
	private String job;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Exam [id=" + id + ", name=" + name + ", job=" + job + "]";
	}
}
