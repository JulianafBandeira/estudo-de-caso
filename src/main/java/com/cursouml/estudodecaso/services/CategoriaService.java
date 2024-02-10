package com.cursouml.estudodecaso.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursouml.estudodecaso.domain.Categoria;
import com.cursouml.estudodecaso.repositories.CategoriaRepository;
import com.cursouml.estudodecaso.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto nao encontrado! Id: " + id
					+ ", Tipo: " + Categoria.class.getName()));
	}
}
