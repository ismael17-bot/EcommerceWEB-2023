package com.example.ecommerce.entity;

import com.example.ecommerce.DTO.CategoriaRequestDTO;
import com.example.ecommerce.DTO.UsuarioRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "CATEGORIAS")
@Entity(name = "CATEGORIAS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Categorias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int category_id;
    private String nome;
    private String descricao;
    private int fgtipo;


    public Categorias(CategoriaRequestDTO categoria){
        this.nome = categoria.nome();
        this.descricao = categoria.descricao();
        this.fgtipo = categoria.fgtipo();
    }

}
