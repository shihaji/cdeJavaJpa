package com.cts;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int subId;
	private String name;
	
	//@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name="roll_No")
	//@ManyToOne
	//@JoinColumn(name="roll_No")
	//private Student student;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="sub_stud",joinColumns = {@JoinColumn(name="sub_id")},
	inverseJoinColumns = {@JoinColumn(name="stud_role")})
	private List<Student> studentList;
	
	
	
	
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	/*
	 * public Student getStudent() { return student; } public void
	 * setStudent(Student student) { this.student = student; }
	 */
	public int getSubId() {
		return subId;
	}
	public void setSubId(int subId) {
		this.subId = subId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
