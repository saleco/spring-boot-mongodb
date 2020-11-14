package com.github.saleco.springbootmongodb.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@NoArgsConstructor
@ToString
@Document(collection = "student")
public class Student {

  @Id
  private String id;

  private String name;

  //defined because the field in mongo is different
  @Field(name = "mail")
  private String email;

  private Department department;

  private List<Subject> subjects;

  public Student(String id, Department department) {
    super();
    this.id = id;
    this.department = department;
  }

  @PersistenceConstructor //mandatory when have more then one constructor in the class
  public Student(String id, String name, String email, Department department, List<Subject> subjects) {
    super();
    this.id = id;
    this.name = name;
    this.email = email;
    this.department = department;
    this.subjects = subjects;
  }
}
