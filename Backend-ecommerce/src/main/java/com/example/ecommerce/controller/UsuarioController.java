package com.example.ecommerce.controller;


import com.example.ecommerce.DTO.LoginFormDTO;
import com.example.ecommerce.DTO.ProductRequestDTO;
import com.example.ecommerce.DTO.UsuarioRequestDTO;
import com.example.ecommerce.entity.Usuarios;
import com.example.ecommerce.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
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
