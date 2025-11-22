package com.example.ProjetoBiblioteca.repositories;

import com.example.ProjetoBiblioteca.entities.Biblioteca;
import com.example.ProjetoBiblioteca.entities.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {
}
