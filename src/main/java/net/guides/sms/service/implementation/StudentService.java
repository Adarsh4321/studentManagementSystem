package net.guides.sms.service.implementation;

import net.guides.sms.entity.Student;
import net.guides.sms.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService{

    private final StudentRepository studentRepository;

    StudentService(StudentRepository studentRepository){
        super();
        this.studentRepository = studentRepository;
    }
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }

}
