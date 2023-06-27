package com.example.ecommerce.service;

import com.example.ecommerce.entity.Token;
import com.example.ecommerce.entity.Usuarios;
import com.example.ecommerce.repository.TokenRepository;
import com.example.ecommerce.repository.UsuariosRepository;
import lombok.experimental.Helper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class TokenService {


    @Autowired
    private TokenRepository repository;
    @Autowired
    private UsuariosRepository usuariosRepository;

    public void saveConfirmationToken(Token authenticationToken) {
        repository.save(authenticationToken);
    }

    public Token getToken(Usuarios user) {
        return repository.findTokenByUser(user);
    }

    public Usuarios getUser(String token) {
        Token authenticationToken = repository.findTokenByToken(token);
        if (authenticationToken != null) {
            if (authenticationToken.getUser() != null) {
                return authenticationToken.getUser();
            }
        }
        return null;
    }


}
