package com.example.ecommerce.repository;

import com.example.ecommerce.entity.Carrinho;
import com.example.ecommerce.entity.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarrinhoRepository extends JpaRepository<Carrinho, Integer> {
    List<Carrinho> findAllByUser(Usuarios usuarios);
    Carrinho findByUser(Usuarios usuarios);

    @Query("SELECT c FROM CARRINHO c WHERE c.user.id = :userId")
    List<Carrinho> findByUserId(Integer userId);
    List<Carrinho> deleteByUser(Usuarios user);
}
