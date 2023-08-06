package org.nishchhal.project1.service;






@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDAO studentDAO;

    @Override
    public List<Student> getAllStudents() {
        return studentDAO.getAllStudents();
    }

    @Override
    public void addStudent(Student student) {
        studentDAO.addStudent(student);
    }

    @Override
    public void updateStudent(Student student) {
        studentDAO.updateStudent(student);
    }

    @Override
    public void deleteStudent(Long studentId) {
        studentDAO.deleteStudent(studentId);
    }

    @Override
    public Student getStudentById(Long studentId) {
        return studentDAO.getStudentById(studentId);
    }
}
