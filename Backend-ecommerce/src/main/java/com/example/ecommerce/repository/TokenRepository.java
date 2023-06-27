package com.example.ecommerce.repository;

import com.example.ecommerce.entity.Token;
import com.example.ecommerce.entity.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<Token, Integer> {

    Token findTokenByUser(Usuarios user);
    Token findTokenByToken(String token);
}
