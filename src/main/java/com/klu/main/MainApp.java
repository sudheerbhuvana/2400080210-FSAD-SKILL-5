package com.klu.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.klu.config.AppConfig;
import com.klu.model.Student;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);
		Student student = con.getBean(Student.class);
		student.display();
		con.close();
	}

}
