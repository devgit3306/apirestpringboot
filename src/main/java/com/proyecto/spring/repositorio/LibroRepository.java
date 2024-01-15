package com.proyecto.spring.repositorio;

import com.proyecto.spring.models.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Long> {

}