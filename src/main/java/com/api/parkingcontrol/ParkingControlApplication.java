package com.api.parkingcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//essa classe é um bean do tipo controller, entao vai ser gerado as dependencias 
@RestController
public class ParkingControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingControlApplication.class, args);
		System.out.println(new BCryptPasswordEncoder().encode("admin2023"));
	}
	
	@GetMapping("/") // metodo http 
	public String index() {
		return "Olá Mundo";
	}
}
