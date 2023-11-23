package com.app.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Student;
import com.app.repo.StudentRepository;
import com.app.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private StudentRepository studentRepo;
	
	@Override
	public String saveStudent(Student student) {
		
		Student stud = studentRepo.save(student);
		
		return "Student is save with "+stud.getSid()+"Id";
	}

	@Override
	public Iterable<Student> getStudentByIds(Iterable<Integer> ids) {
		
		Iterable<Student> list= studentRepo.findAllById(ids);
		
		return list;
	}

}
