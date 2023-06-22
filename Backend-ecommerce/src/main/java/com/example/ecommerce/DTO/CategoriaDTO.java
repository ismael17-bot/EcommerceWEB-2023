package com.example.ecommerce.DTO;

import com.example.ecommerce.entity.Categorias;

public record CategoriaDTO(int categoria_id, String nome, String descricao, int fgtipo) {
    public CategoriaDTO(Categorias categoria){
        this(categoria.getCategory_id(), categoria.getNome(), categoria.getDescricao(), categoria.getFgtipo());
    }
}
