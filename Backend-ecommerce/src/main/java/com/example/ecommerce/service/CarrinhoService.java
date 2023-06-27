package com.example.ecommerce.service;

import com.example.ecommerce.DTO.CarrinhoDTO;
import com.example.ecommerce.DTO.CarrinhoProdutoDTO;
import com.example.ecommerce.DTO.CarrinhoRequestDTO;
import com.example.ecommerce.entity.Carrinho;
import com.example.ecommerce.entity.Product;
import com.example.ecommerce.entity.Usuarios;
import com.example.ecommerce.repository.CarrinhoRepository;
import com.example.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarrinhoService {

    @Autowired
    private CarrinhoRepository carrinhoRepository;
    @Autowired
    private ProductService productService;

    public void addToCart(CarrinhoRequestDTO addToCartDto, Product product, Usuarios user) {
        Carrinho cart = new Carrinho(product, addToCartDto.quantidade(), user);
        carrinhoRepository.save(cart);
    }

    public CarrinhoDTO listCartItems(Usuarios user) {
        List<Carrinho> cartList = carrinhoRepository.findByUserId(user.getUser_id());
        List<CarrinhoProdutoDTO> cartItems = new ArrayList<>();
        for (Carrinho cart:cartList){
            CarrinhoProdutoDTO cartItemDto = new CarrinhoProdutoDTO(cart);
            cartItems.add(cartItemDto);
        }
        BigDecimal totalCost = BigDecimal.valueOf(0);

        for (CarrinhoProdutoDTO cartItemDto :cartItems){
            totalCost = (productService.getProductById(cartItemDto.productId()).price().multiply(new BigDecimal(cartItemDto.quantidade())));
        }
        return new CarrinhoDTO(cartItems,totalCost);
    }

    public void updateCartItem(CarrinhoRequestDTO cartDto, Usuarios user, Product product) {
        Carrinho cart = carrinhoRepository.findByUser(user);
        cart.setQuantidade(cartDto.quantidade());

        carrinhoRepository.save(cart);
    }

    public void deleteCartItem(int itemID) {
        if (!carrinhoRepository.existsById(itemID)){
            throw new RuntimeException();
        }
        carrinhoRepository.deleteById(itemID);
    }
}
