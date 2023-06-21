package com.example.ecommerce.DTO;

import com.example.ecommerce.entity.Usuarios;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginFormDTO {
    private String email;
    private String senha;

    public LoginFormDTO() {
    }

    public LoginFormDTO(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
}
