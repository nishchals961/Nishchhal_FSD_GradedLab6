package org.nishchhal.project1.dao;

public interface StudentDAO {
	List<Student> getAllStudents();
	Student getStudentById(Long id);
	void addStudent(Student student);
	void updateStudent(Student student);
	void deleteStudent(Student student);
}
