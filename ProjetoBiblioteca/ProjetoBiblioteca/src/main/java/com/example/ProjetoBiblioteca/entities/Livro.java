package com.example.ProjetoBiblioteca.entities;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.Date;

@Entity
public class Livro {
    @Id
    @Column(length = 11)
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public Livro(Integer Id, String titulo, String autor, String editora, Instant anoPublicacao, String isbn, String genero, Integer quantExemplares, String exemplaresDisponiveis){
        this.Id = Id;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.isbn = isbn;
        this.genero = genero;
        this.quantExemplares = quantExemplares;
        this.exemplaresDisponiveis = exemplaresDisponiveis;
    }
    public Livro() {
    }
    private Integer Id;
    private String titulo;
    private String autor;
    private String editora;
    private Instant anoPublicacao;
    private String isbn;
    private String genero;
    private Integer quantExemplares;
    private String exemplaresDisponiveis;

}
