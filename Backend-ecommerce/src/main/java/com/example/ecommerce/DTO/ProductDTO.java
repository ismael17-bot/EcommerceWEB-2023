package com.example.ecommerce.DTO;

import com.example.ecommerce.entity.Product;

import java.math.BigDecimal;
import java.util.Date;

public record ProductDTO(int id, int cdproduto, String nome, String descricao, BigDecimal price, int estoque,
                         String marca, BigDecimal peso, BigDecimal largura, BigDecimal altura, BigDecimal comprimento,
                         String cor, String imagemURL, Date dataCadastro) {
    public ProductDTO(Product product) {
        this(product.getId(), product.getCdproduto(), product.getNome(), product.getDescricao(), product.getPreco(), product.getEstoque(), product.getMarca(), product.getPeso(), product.getLargura(), product.getAltura(), product.getComprimento(), product.getCor(), product.getImagemURL(), product.getDatacadastro());
    }
}
