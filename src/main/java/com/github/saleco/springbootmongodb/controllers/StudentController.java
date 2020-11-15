package com.github.saleco.springbootmongodb.controllers;

import com.github.saleco.springbootmongodb.entities.Student;
import com.github.saleco.springbootmongodb.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/student")
public class StudentController {

  private final StudentService studentService;

  @PostMapping("/create")
  public Student createStudent(@RequestBody Student student) {
    return studentService.createStudent(student);
  }

  @GetMapping("/getById/{id}")
  public Student getStudentById(@PathVariable String id) {
    return studentService.getStudentById(id);
  }

  @GetMapping("/all")
  public List<Student> getAllStudents() {
    return studentService.getAllStudents();
  }

  @PutMapping("/update")
  public Student updateStudent(@RequestBody Student student) {
    return studentService.updateStudent(student);
  }

  @DeleteMapping("/delete/{id}")
  public String deleteStudent(@PathVariable String id){
    return studentService.deleteStudent(id);
  }

  @GetMapping("/studentsByName/{name}")
  public List<Student> studentsByName(@PathVariable String name) {
    return studentService.getStudentsByName(name);
  }

  @GetMapping("/studentsByNameAndMail")
  public List<Student> studentsByNameAndMail(@RequestParam String name, @RequestParam String mail) {
    return studentService.getStudentsByNameAndMail(name, mail);
  }

  @GetMapping("/studentsByNameOrMail")
  public List<Student> studentsByNameOrMail(@RequestParam String name, @RequestParam String mail) {
    return studentService.getStudentsByNameOrMail(name, mail);
  }

  @GetMapping("/allWithPagination")
  public Page<Student> getAllWithPagination(@RequestParam(name = "page", defaultValue = "0") int page, @RequestParam(name = "size", defaultValue = "20") int size) {
    return studentService.getAllWithPaginated(page, size);
  }

  @GetMapping("/allWithSorting")
  public List<Student> getAllWithSorting() {
    return studentService.getAllWithSorting();
  }
  @GetMapping("/byDepartmentName")
  public List<Student> getByDepartmentName(@RequestParam String departmentName) {
    return studentService.getByDeparmentName(departmentName);
  }

  @GetMapping("/bySubjectName")
  public List<Student> getBySubjectName(@RequestParam String subjectName) {
    return studentService.getBySubjectName(subjectName);
  }

  @GetMapping("/byEmailLike")
  public List<Student> getByEmailBy(@RequestParam String email) {
    return studentService.getByEmailLike(email);
  }

  @GetMapping("/byNameStartingWith")
  public List<Student> getByNameStartingWith(@RequestParam String name) {
    return studentService.getByNameStartingWith(name);
  }



}
