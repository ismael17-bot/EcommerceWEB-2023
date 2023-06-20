package com.example.ecommerce.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "USUARIOS")
@Entity(name = "USUARIOS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;
    private String nome;
    private String email;
    private String senha;
    private String endereco;
    private String cidade;
    private String estado;
    private String pais;
    private String codigo_postal;
    private String telefone;
}
