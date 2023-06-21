package com.example.ecommerce.DTO;

import com.example.ecommerce.entity.ItemPedido;

import java.math.BigDecimal;

public record ItemPedidoDTO(int order_id, int product_id, int quantidade, BigDecimal preco_unitario, BigDecimal subtotal) {
    public ItemPedidoDTO(ItemPedido itemPedido){
        this(itemPedido.getOrder_id(), itemPedido.getProduct_id(), itemPedido.getQuantidade(), itemPedido.getPreco_unitario(), itemPedido.getSubtotal());
    }
}
