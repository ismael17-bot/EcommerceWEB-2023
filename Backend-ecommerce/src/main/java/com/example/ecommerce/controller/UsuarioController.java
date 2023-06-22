package com.example.ecommerce.controller;


import com.example.ecommerce.DTO.*;
import com.example.ecommerce.entity.Usuarios;
import com.example.ecommerce.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<UsuarioDTO> getAllUsers() {
        return usuarioService.getAllUsers();
    }
    @PostMapping("/add")
    public void addUser(@RequestBody UsuarioRequestDTO usuario) {
        usuarioService.addUser(usuario);
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginFormDTO form) {
        String email = form.getEmail();
        String senha = form.getSenha();

        Usuarios usuario = usuarioService.autenticarUsuario(email, senha);

        if (usuario != null) {
            return "Usuário autenticado com sucesso!";
        } else {
            return "Usuário não encontrado ou senha incorreta!";
        }
    }

}
