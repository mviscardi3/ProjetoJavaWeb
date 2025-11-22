package com.example.ProjetoBiblioteca.repositories;

import com.example.ProjetoBiblioteca.entities.Biblioteca;
import com.example.ProjetoBiblioteca.entities.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}
