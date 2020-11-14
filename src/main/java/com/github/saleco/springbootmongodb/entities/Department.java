package com.github.saleco.springbootmongodb.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Department {

  @Field(name = "department_name")
  private String departmentName;

  private String location;
}
