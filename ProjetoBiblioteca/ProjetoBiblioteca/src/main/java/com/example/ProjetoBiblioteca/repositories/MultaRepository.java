package com.example.ProjetoBiblioteca.repositories;

import com.example.ProjetoBiblioteca.entities.Biblioteca;
import com.example.ProjetoBiblioteca.entities.Multa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MultaRepository extends JpaRepository<Multa, Integer> {
}
