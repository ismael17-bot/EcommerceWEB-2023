package com.example.ecommerce.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "CARRINHO")
@Entity(name = "CARRINHO")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Carrinho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "productId", nullable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Usuarios user;

    @Column(nullable = false)
    private Integer quantidade;

    public Carrinho(Product product, Integer quantidade, Usuarios user){
        this.user = user;
        this.product = product;
        this.quantidade = quantidade;
    }
}
