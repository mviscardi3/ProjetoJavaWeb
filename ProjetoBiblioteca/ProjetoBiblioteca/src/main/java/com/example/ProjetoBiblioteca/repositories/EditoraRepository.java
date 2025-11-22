package com.example.ProjetoBiblioteca.repositories;

import com.example.ProjetoBiblioteca.entities.Biblioteca;
import com.example.ProjetoBiblioteca.entities.Editora;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EditoraRepository extends JpaRepository<Editora, Integer> {
}
