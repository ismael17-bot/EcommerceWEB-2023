package com.example.ecommerce.DTO;

import com.example.ecommerce.entity.Pedidos;

import java.math.BigDecimal;

public record PedidoRequestDTO(int userId, String status, String enderecoEntrega, String cidadeEntrega,
                               String estadoEntrega, String paisEntrega, String codigoPostalEntrega, String telefoneContato,
                               String metodoPagamento, BigDecimal valorTotal) {

}
