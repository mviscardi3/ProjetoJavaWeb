package com.example.ProjetoBiblioteca.repositories;

import com.example.ProjetoBiblioteca.entities.Autor;
import com.example.ProjetoBiblioteca.entities.Biblioteca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Integer> {

}
