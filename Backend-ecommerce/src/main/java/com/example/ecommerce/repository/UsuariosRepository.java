package com.example.ecommerce.repository;

import com.example.ecommerce.entity.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepository extends JpaRepository<Usuarios, Integer> {
}
