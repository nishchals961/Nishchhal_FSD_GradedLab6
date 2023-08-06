package org.nishchhal.project1.service;

public interface StudentService {
	List<Student> getAllStudents();
	void addStudent(Student student);
	void updateStudent(Student student);
	void deleteStudent(Long studentId);
	Student getStudentById(Long studentId);
}