package com.example.ecommerce.DTO;

import com.example.ecommerce.entity.Carrinho;

public record CarrinhoProdutoDTO( Integer id, Integer productId, Integer quantidade) {
    public CarrinhoProdutoDTO(Carrinho carrinho){
        this(carrinho.getId(), carrinho.getProduct().getId(), carrinho.getQuantidade());
    }
}
