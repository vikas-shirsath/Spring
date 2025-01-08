package com.vikas.spring_data_jpa_ex;

import com.vikas.spring_data_jpa_ex.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaExApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

//		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
//		Student s3 = context.getBean(Student.class);
//
//		s1.setRollNo(1);
//		s1.setName("Vikas");
//		s1.setMarks(90);
//
		s2.setRollNo(2);
		s2.setName("Navin");
		s2.setMarks(65);
//
//		s3.setRollNo(3);
//		s3.setName("Raj");
//		s3.setMarks(90);

//		Optional<Student> s = repo.findById(11);
//
//		System.out.println(s.orElse(new Student()));

//		System.out.println(repo.findAll());

//		System.out.println(repo.findByName("Vikas"));
//
//		System.out.println(repo.findByMarks(90));
//
//		System.out.println(repo.findByMarksGreaterThan(60));

//		repo.save(s2);  //--update

		repo.delete(s2);

	}

}