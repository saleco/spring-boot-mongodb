package com.github.saleco.springbootmongodb.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Subject {

  @Field(name = "subject_name")
  private String subjectName;

  @Field(name = "marks_obtained")
  private int marksObtained;

}
