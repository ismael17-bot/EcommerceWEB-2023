package com.example.ecommerce.repository;

import com.example.ecommerce.entity.Categorias;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categorias, Long> {
}
