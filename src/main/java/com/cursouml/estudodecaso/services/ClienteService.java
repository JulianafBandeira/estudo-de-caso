package com.cursouml.estudodecaso.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursouml.estudodecaso.domain.Cliente;
import com.cursouml.estudodecaso.repositories.ClienteRepository;
import com.cursouml.estudodecaso.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto nao encontrado! Id: " + id
					+ ", Tipo: " + Cliente.class.getName()));
	}
}
