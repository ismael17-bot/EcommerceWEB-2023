package com.example.ecommerce.controller;

import com.example.ecommerce.DTO.CategoriaDTO;
import com.example.ecommerce.DTO.CategoriaRequestDTO;
import com.example.ecommerce.DTO.UsuarioDTO;
import com.example.ecommerce.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<CategoriaDTO> getAllUsers() {
        return categoriaService.getAllCategorias();
    }
    @PostMapping("/add")
    public void addCategoria(@RequestBody CategoriaRequestDTO categoria){
        categoriaService.addCategoria(categoria);
    }

    @PostMapping("/edit/{id}")
    public void updtadeCategoria(@PathVariable Integer id,@RequestBody CategoriaRequestDTO categoria){
        categoriaService.editCategoria(id,categoria);
    }

    @GetMapping("/product/{id}")
    public CategoriaDTO getEspecficProductById(@PathVariable Integer id) {
        return categoriaService.getCategoriaById(id);
    }
}
