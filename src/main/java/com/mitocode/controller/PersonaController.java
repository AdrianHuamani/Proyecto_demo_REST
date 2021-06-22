package com.mitocode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.repo.PersonaRepoImpl;

@RestController
@RequestMapping("/demo")
public class PersonaController {
		@Autowired
		PersonaRepoImpl repo;
		
		@GetMapping("/get")
		public void saludar() {
			repo.saludar();
		}
}
