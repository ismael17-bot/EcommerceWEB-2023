package com.example.ecommerce.DTO;

public record UsuarioRequestDTO(String nome, String email, String senha, String endereco, String cidade,
        String estado, String pais, String codigo_postal, String telefone) {
}
