package br.ifms.edu.frame1;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Frame1Application {

	public static void main(String[] args) {
		SpringApplication.run(Frame1Application.class, args);
	}

	@GetMapping("/")
	public String hello() {
		return "Minha página spring";
	}
}
