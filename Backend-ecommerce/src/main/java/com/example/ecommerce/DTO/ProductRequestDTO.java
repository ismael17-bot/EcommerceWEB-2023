package com.example.ecommerce.DTO;

import java.math.BigDecimal;
import java.util.Date;

public record ProductRequestDTO(int cdproduto, String nome, String descricao, BigDecimal preco, int estoque, String marca, BigDecimal peso, BigDecimal largura, BigDecimal altura, BigDecimal comprimento, String cor, String imagemURL, Date datacadastro, Integer fgtipoproduto) {
}
