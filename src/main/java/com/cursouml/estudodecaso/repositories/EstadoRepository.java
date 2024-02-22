package com.cursouml.estudodecaso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cursouml.estudodecaso.domain.Estado;

@Repository
public interface EstadoRepository  extends JpaRepository<Estado, Integer>{
	

}
