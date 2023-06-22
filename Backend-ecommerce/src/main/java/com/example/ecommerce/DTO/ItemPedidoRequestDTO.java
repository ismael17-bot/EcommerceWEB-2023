package com.example.ecommerce.DTO;

import com.example.ecommerce.entity.ItemPedido;

import java.math.BigDecimal;

public record ItemPedidoRequestDTO( int product_id, int quantidade, BigDecimal preco_unitario, BigDecimal subtotal) {
}
