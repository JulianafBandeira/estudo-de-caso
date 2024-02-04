package com.cursouml.estudodecaso;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cursouml.estudodecaso.domain.Categoria;
import com.cursouml.estudodecaso.repositories.CategoriaRepository;

@SpringBootApplication
public class EstudodecasoApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(EstudodecasoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escrtório");
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
		
		
	}

}
