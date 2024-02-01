package br.com.deimos.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class ExampleController {
	
	@Value("${message}")
	private String message;

	@GetMapping
	public ResponseEntity<String> HelloK8s() {
		
		return ResponseEntity.ok(message);
	}
}
