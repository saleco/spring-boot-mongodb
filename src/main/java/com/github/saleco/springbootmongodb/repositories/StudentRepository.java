package com.github.saleco.springbootmongodb.repositories;

import com.github.saleco.springbootmongodb.entities.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
  List<Student> findByName(String name);
  List<Student> findByNameAndEmail(String name, String mail);
  List<Student> findByNameOrEmail(String name, String mail);
  List<Student> findByDepartmentDepartmentName(String departmentName);
  List<Student> findBySubjectsSubjectName(String subjectName);
  List<Student> findByEmailIsLike(String email);
  List<Student> findByNameStartsWith(String name);
}
