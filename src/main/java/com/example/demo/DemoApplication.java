package com.example.demo;

//import com.example.demo.idengeli.Idengeli;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//import java.time.LocalDate;
//import java.time.Month;
//import java.util.List;

@SpringBootApplication
//@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@GetMapping
//	public  String RayHello(){
//		return  "Hello World";  // displays hello world in the localhost
//	}
//}

//	@GetMapping
//	public List<String>  RayHello(){
//		return List.of("Hello" , "World") ;  // displays hello world in the localhost in JSON format
//	}


//	To display out Idengeli Class in JSON format,
//	@GetMapping
//	public List<Idengeli> RayHello(){
//		return  List.of(
//				new Idengeli(
//						1L,
//						"Raymond Idengeli",
//						34,
//						"Java Developer",
//						'M',
//						LocalDate.of(1990, Month.JULY, 7),
//						"ray.idengeli@gmail.com"
//				)
//		);
//	}
}