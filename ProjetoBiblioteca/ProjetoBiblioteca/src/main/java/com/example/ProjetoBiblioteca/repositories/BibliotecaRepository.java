package com.example.ProjetoBiblioteca.repositories;

import com.example.ProjetoBiblioteca.entities.Biblioteca;
import com.example.ProjetoBiblioteca.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BibliotecaRepository extends JpaRepository<Biblioteca, Integer> {
}
