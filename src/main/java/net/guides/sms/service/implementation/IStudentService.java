package net.guides.sms.service.implementation;

import net.guides.sms.entity.Student;

import java.util.List;

public interface IStudentService {
    List<Student>  getAllStudents();
    Student saveStudent(Student student);

    Student updateStudent(Student student);

    Student getStudentById(Long id);

    void deleteStudentById(Long id);

}
