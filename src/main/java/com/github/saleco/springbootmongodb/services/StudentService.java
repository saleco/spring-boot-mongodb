package com.github.saleco.springbootmongodb.services;

import com.github.saleco.springbootmongodb.entities.Student;
import com.github.saleco.springbootmongodb.repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StudentService {

  private final StudentRepository studentRepository;

  public Student createStudent(Student student) {
    return studentRepository.save(student);
  }

  public Student getStudentById(String id) {
    return studentRepository.findById(id).get();
  }

  public List<Student> getAllStudents() {
    return studentRepository.findAll();
  }

  public Page<Student> getAllWithPaginated(int page, int size) {
    return studentRepository.findAll(PageRequest.of(page,size));
  }

  public Student updateStudent(Student student) {
    return studentRepository.save(student);
  }

  public String deleteStudent(String id) {
    studentRepository.deleteById(id);
    return "Student has been deleted";
  }

  public List<Student> getStudentsByName(String name) {
    return studentRepository.findByName(name);
  }

  public List<Student> getStudentsByNameAndMail(String name, String mail) {
    return studentRepository.findByNameAndEmail(name, mail);
  }

  public List<Student> getStudentsByNameOrMail(String name, String mail) {
    return studentRepository.findByNameOrEmail(name, mail);
  }

  public List<Student> getAllWithSorting() {
    Sort sort = Sort.by(Sort.Direction.ASC, "name", "email");
    return studentRepository.findAll(sort);
  }

  public List<Student> getByDeparmentName(String departmentName) {
    return studentRepository.findByDepartmentDepartmentName(departmentName);
  }

  public List<Student> getBySubjectName(String subjectName) {
    return studentRepository.findBySubjectsSubjectName(subjectName);
  }

  public List<Student> getByEmailLike(String email) {
    return studentRepository.findByEmailIsLike(email);
  }

  public List<Student> getByNameStartingWith(String name) {
    return studentRepository.findByNameStartsWith(name);
  }
}
