package com.example.ProjetoBiblioteca.repositories;

import com.example.ProjetoBiblioteca.entities.Biblioteca;
import com.example.ProjetoBiblioteca.entities.Multa;
import com.example.ProjetoBiblioteca.entities.Reserva;
import com.example.ProjetoBiblioteca.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva, Integer> {
}
