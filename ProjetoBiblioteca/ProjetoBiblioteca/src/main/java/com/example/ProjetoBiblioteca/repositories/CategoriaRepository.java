package com.example.ProjetoBiblioteca.repositories;

import com.example.ProjetoBiblioteca.entities.Biblioteca;
import com.example.ProjetoBiblioteca.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
