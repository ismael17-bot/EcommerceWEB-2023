package com.example.ecommerce.DTO;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public class CarrinhoDTO {
    private List<CarrinhoProdutoDTO> cartItems;
    private BigDecimal totalCost;
    public CarrinhoDTO(List<CarrinhoProdutoDTO> cartItemDtoList, BigDecimal totalCost) {
        this.cartItems = cartItemDtoList;
        this.totalCost = totalCost;
    }

    public List<CarrinhoProdutoDTO> getcartItems() {
        return cartItems;
    }

    public void setCartItems(List<CarrinhoProdutoDTO> cartItemDtoList) {
        this.cartItems = cartItemDtoList;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }
}
