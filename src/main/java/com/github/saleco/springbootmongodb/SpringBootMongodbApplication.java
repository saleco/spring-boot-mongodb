package com.github.saleco.springbootmongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.github.saleco.springbootmongodb.repositories")
public class SpringBootMongodbApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootMongodbApplication.class, args);
  }

}
