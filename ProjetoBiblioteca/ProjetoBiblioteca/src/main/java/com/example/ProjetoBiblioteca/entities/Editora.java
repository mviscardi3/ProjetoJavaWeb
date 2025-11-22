package com.example.ProjetoBiblioteca.entities;

import jakarta.persistence.*;

@Entity
public class Editora {
    @Id
    @Column(length = 11)
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public Editora(Integer Id, String Nome, String cnpj, String endereco){
        this.Id = Id;
        this.Nome = Nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    public Editora() {
    }
    private Integer Id;
    private String Nome;
    private String cnpj;
    private String endereco;

}
