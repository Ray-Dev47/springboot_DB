package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@GetMapping
//	public  String RayHello(){
//		return  "Hello World";  // displays hello world in the localhost
//	}
//}

	@GetMapping
	public List<String> RayHello() {
		return List.of("Hello,  World");  // displays hello world in the localhost in JSON format
	}
}