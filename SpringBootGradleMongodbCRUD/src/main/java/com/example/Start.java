package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Start.class, args);
		System.out.println("Spring boot integration with mongodb");
		

	}
	 public boolean someStartMethod() {
	        return true;
	    }

}
