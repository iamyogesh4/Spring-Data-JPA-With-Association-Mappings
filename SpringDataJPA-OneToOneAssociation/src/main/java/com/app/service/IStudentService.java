package com.app.service;

import com.app.entity.Student;

public interface IStudentService {
	
	public String saveStudent(Student student);
	
	public Iterable<Student> getStudentByIds(Iterable<Integer> ids);

}
