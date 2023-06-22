package com.example.ecommerce.service;

import com.example.ecommerce.DTO.CategoriaDTO;
import com.example.ecommerce.DTO.CategoriaRequestDTO;
import com.example.ecommerce.DTO.UsuarioDTO;
import com.example.ecommerce.entity.Categorias;
import com.example.ecommerce.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public void addCategoria(CategoriaRequestDTO categoria) {
        categoriaRepository.save(new Categorias(categoria));
    }

    public CategoriaDTO getCategoriaById(Integer id) {
        Optional<Categorias> optional = categoriaRepository.findById(id);
        if (optional.isPresent()){
            return converterDTO(optional.get());
        } else {
            return null;
        }
    }

    public CategoriaDTO converterDTO(Categorias categorias){
        return new CategoriaDTO(categorias);
    }

    public List<CategoriaDTO> getAllCategorias() {
        return categoriaRepository.findAll().stream().map(CategoriaDTO::new).toList();
    }
}
