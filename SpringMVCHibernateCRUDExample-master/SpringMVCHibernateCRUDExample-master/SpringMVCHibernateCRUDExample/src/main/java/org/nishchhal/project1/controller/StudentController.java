package org.nishchhal.project1.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private StudentService studentService;

	@GetMapping("/list")
	public String listStudents(Model model) {
		List<Student> students = studentService.getAllStudents();
		model.addAttribute("students", students);
		return "student-list";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "student-form";
	}

	@PostMapping("/saveStudent")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.addStudent(student);
		return "redirect:/students/list";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("studentId") Long studentId, Model model) {
		Student student = studentService.getStudentById(studentId);
		model.addAttribute("student", student);
		return "student-form";
	}

	@GetMapping("/delete")
	public String deleteStudent(@RequestParam("studentId") Long studentId) {
		studentService.deleteStudent(studentId);
		return "redirect:/students/list";
	}
}

