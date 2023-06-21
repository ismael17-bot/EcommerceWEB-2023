package com.example.ecommerce.DTO;

import com.example.ecommerce.entity.Usuarios;

public record UsuarioDTO(int user_id, String nome, String email, String senha, String endereco, String cidade,
                         String estado, String pais, String codigo_postal, String telefone) {
    public UsuarioDTO(Usuarios usuarios) {
        this(usuarios.getUser_id(), usuarios.getNome(), usuarios.getEmail(), usuarios.getSenha(), usuarios.getEndereco(), usuarios.getCidade(), usuarios.getEstado(), usuarios.getPais(), usuarios.getCodigo_postal(), usuarios.getTelefone());
    }
}
