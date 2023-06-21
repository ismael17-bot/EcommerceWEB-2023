package com.example.ecommerce.service;

import com.example.ecommerce.DTO.UsuarioRequestDTO;
import com.example.ecommerce.entity.Usuarios;
import com.example.ecommerce.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UsuarioService {

    @Autowired
    private UsuariosRepository usuariosRepository;
    public void addUser(UsuarioRequestDTO usuario) {
        usuariosRepository.save(new Usuarios(usuario));
    }

    public Usuarios autenticarUsuario(String email, String senha) {
        Usuarios usuario = usuariosRepository.findByEmail(email);

        if (usuario != null && usuario.getSenha().equals(senha)) {
            return usuario;
        } else {
            return null;
        }
    }
}
