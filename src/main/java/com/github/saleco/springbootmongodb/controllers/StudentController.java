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

  @GetMapping("/all-paginated")
  public Page<Student> getAllStudentsPaginated(@RequestParam(name = "page", defaultValue = "0") int page, @RequestParam(name = "size", defaultValue = "20") int size) {
    return studentService.getAllStudentsPaginated(page, size);
  }

  @PutMapping("/update")
  public Student updateStudent(@RequestBody Student student) {
    return studentService.updateStudent(student);
  }

  @DeleteMapping("/delete/{id}")
  public String deleteStudent(@PathVariable String id){
    return studentService.deleteStudent(id);
  }


}
