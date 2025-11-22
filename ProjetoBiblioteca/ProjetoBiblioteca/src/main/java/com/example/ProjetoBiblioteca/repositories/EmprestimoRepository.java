package com.example.ProjetoBiblioteca.repositories;

import com.example.ProjetoBiblioteca.entities.Biblioteca;
import com.example.ProjetoBiblioteca.entities.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Integer> {
}
