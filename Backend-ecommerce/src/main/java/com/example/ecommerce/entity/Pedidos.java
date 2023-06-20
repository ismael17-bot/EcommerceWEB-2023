package com.example.ecommerce.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Table(name = "PEDIDOS")
@Entity(name = "PEDIDOS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int order_id;
    private int user_id;
    //private Date data;
    private String status;
    private String endereco_entrega;
    private String cidade_entrega;
    private String estado_entrega;
    private String pais_entrega;
    private String codigo_postal_entrega;
    private String telefone_contato;
    private String metodo_pagamento;
    private BigDecimal valor_total;
}
