package com.example.ecommerce.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Table(name = "ITENS_PEDIDOS")
@Entity(name = "ITENS_PEDIDOS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ItemPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int order_id;
    private int product_id;
    private int quantidade;
    private BigDecimal preco_unitario;
    private BigDecimal subtotal;
}
