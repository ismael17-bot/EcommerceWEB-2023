package com.example.ecommerce.repository;

import com.example.ecommerce.entity.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidosRepository extends JpaRepository<Pedidos, Integer> {
}
