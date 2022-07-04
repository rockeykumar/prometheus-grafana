package com.vs24.prometheusgrafana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PrometheusGrafanaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrometheusGrafanaApplication.class, args);
	}

	@GetMapping("/something")
	public ResponseEntity<String> createLogs() {
		System.out.println("Just checking");
		return ResponseEntity.ok().body("All ok");
	}
}
