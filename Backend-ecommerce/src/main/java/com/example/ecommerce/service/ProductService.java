package com.example.ecommerce.service;

import com.example.ecommerce.DTO.ProductDTO;
import com.example.ecommerce.DTO.ProductRequestDTO;
import com.example.ecommerce.entity.Product;
import com.example.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productrepository;

    public List<ProductDTO> getAllProducts() {
        List<ProductDTO> products = productrepository.findAll().stream().map(ProductDTO::new).toList();
        return products;
    }

    public void addProduct(ProductRequestDTO product) {
        Product productData = new Product(product);
        productrepository.save(productData);
    }

    public ProductDTO getProductById(Integer id) {
        Optional<Product> optionalProduct = productrepository.findById(id);
        if (optionalProduct.isPresent()){
            Product product = optionalProduct.get();
            return converterDTO(product);
        } else {
            return null;
        }
    }
    public ProductDTO buscarPorNome(String nome) {
        return converterDTO(productrepository.findByNome(nome));
    }
    public ProductDTO converterDTO(Product product){
        ProductDTO dto = new ProductDTO(product);
        return dto;
    }
}