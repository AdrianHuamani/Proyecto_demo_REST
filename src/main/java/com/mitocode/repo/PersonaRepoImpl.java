package com.mitocode.repo;

import org.springframework.stereotype.Repository;

@Repository
public class PersonaRepoImpl implements IPersonaRepo {

	@Override
	public void saludar() {
		// TODO Auto-generated method stub
		System.out.println("Hola Coders");
	}

}
