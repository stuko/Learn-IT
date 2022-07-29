package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.spring.car.Car;

@SpringBootApplication
@RestController
public class DemoApplication {
	
	@Autowired
	Car tesla;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public String run() {
		tesla.move();
		tesla.park();
		return "running";
	}
	
}
