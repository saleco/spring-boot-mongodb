package com.github.saleco.springbootmongodb.repositories;

import com.github.saleco.springbootmongodb.entities.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

}
