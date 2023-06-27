package com.example.ecommerce.controller;

import com.example.ecommerce.DTO.CarrinhoDTO;
import com.example.ecommerce.DTO.CarrinhoRequestDTO;
import com.example.ecommerce.entity.Product;
import com.example.ecommerce.entity.Usuarios;
import com.example.ecommerce.repository.ProductRepository;
import com.example.ecommerce.repository.UsuariosRepository;
import com.example.ecommerce.service.CarrinhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("carrinho")
public class CarrinhoController {
    @Autowired
    private CarrinhoService carrinhoService;

    @Autowired
    private UsuariosRepository usuariosRepository;

    @Autowired
    private ProductRepository repository;


    @PostMapping("/add")
    public void addProductToCart(@RequestBody CarrinhoRequestDTO addToCartDto) {
        Usuarios user = usuariosRepository.getById(addToCartDto.userId());
        Product product = repository.getById(addToCartDto.productId());
        carrinhoService.addToCart(addToCartDto, product, user);
    }
    @GetMapping("/findCar/{id}")
    public CarrinhoDTO getCartItems(@PathVariable Integer id) {
        Usuarios user = usuariosRepository.getById(id);
        return carrinhoService.listCartItems(user);
    }
    @PutMapping("/update/{cartItemId}")
    public void updateCartItem(@RequestBody CarrinhoRequestDTO cartDto) {
        Usuarios user = usuariosRepository.getById(cartDto.userId());
        Product product = repository.getById(cartDto.productId());

        carrinhoService.updateCartItem(cartDto, user,product);
    }

    @DeleteMapping("/delete/{cartItemId}")
    public void deleteCartItem(@PathVariable("cartItemId") int itemID) {
        carrinhoService.deleteCartItem(itemID);
    }

}
