package com.example.ecommerce.entity;

import com.example.ecommerce.DTO.ProductRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Table(name = "PRODUTOS")
@Entity(name = "PRODUTOS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int cdproduto;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private int estoque;

    private String marca;
    private BigDecimal peso;
    private BigDecimal largura;
    private BigDecimal altura;
    private BigDecimal comprimento;
    private String cor;
    private Date datacadastro;
    private String imagemURL;

    @ManyToOne
    @JoinColumn(name = "fgtipoproduto", nullable = false)
    Categorias categorias;

    public Product(ProductRequestDTO product, Categorias categorias){
        this.cdproduto = product.cdproduto();
        this.nome = product.nome();
        this.descricao = product.descricao();
        this.preco = product.preco();
        this.estoque = product.estoque();
        this.marca = product.marca();
        this.peso = product.peso();
        this.largura = product.largura();
        this.altura = product.altura();
        this.comprimento = product.comprimento();
        this.cor = product.cor();
        this.imagemURL = product.imagemURL();
        this.categorias = categorias;
        this.datacadastro = product.datacadastro();
    }

}
