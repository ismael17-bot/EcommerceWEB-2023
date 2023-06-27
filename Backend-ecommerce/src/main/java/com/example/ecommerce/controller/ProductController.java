package com.example.ecommerce.controller;

import com.example.ecommerce.DTO.ProductDTO;
import com.example.ecommerce.DTO.ProductRequestDTO;
import com.example.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ecommerce")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<ProductDTO> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    public void addProduct(@RequestBody ProductRequestDTO product) {
        productService.addProduct(product);
    }

    @GetMapping("/product/{id}")
    public ProductDTO getEspecficProductById(@PathVariable Integer id) {
        return productService.getProductById(id);
    }

    @GetMapping("/products/{nome}")
    public ProductDTO getProductByName(@PathVariable String nome) {
        return productService.buscarPorNome(nome);
    }
}
