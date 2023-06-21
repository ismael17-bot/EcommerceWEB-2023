package com.example.ecommerce.entity;

import com.example.ecommerce.DTO.UsuarioRequestDTO;
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


    public Usuarios(UsuarioRequestDTO usuario){
        this.nome = usuario.nome();
        this.email = usuario.email();
        this.senha = usuario.senha();
        this.endereco = usuario.endereco();
        this.cidade = usuario.cidade();
        this.estado = usuario.estado();
        this.pais = usuario.pais();
        this.codigo_postal = usuario.codigo_postal();
        this.telefone = usuario.telefone();
    }

}
