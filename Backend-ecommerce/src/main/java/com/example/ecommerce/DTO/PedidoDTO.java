package com.example.ecommerce.DTO;

import com.example.ecommerce.entity.Pedidos;

import java.math.BigDecimal;

public record PedidoDTO(int orderId, int userId, String status, String enderecoEntrega, String cidadeEntrega,
                        String estadoEntrega, String paisEntrega, String codigoPostalEntrega, String telefoneContato,
                        String metodoPagamento, BigDecimal valorTotal) {

    public PedidoDTO(Pedidos pedido) {
        this(pedido.getOrder_id(), pedido.getUser_id(), pedido.getStatus(), pedido.getEndereco_entrega(), pedido.getCidade_entrega(), pedido.getCidade_entrega(), pedido.getPais_entrega(), pedido.getCodigo_postal_entrega(), pedido.getTelefone_contato(), pedido.getMetodo_pagamento(), pedido.getValor_total());
    }
}
