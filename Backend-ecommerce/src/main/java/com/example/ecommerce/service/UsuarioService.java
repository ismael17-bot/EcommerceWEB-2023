package com.example.ecommerce.service;

import com.example.ecommerce.DTO.UsuarioDTO;
import com.example.ecommerce.DTO.UsuarioRequestDTO;
import com.example.ecommerce.entity.Token;
import com.example.ecommerce.entity.Usuarios;
import com.example.ecommerce.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UsuarioService {

    @Autowired
    private UsuariosRepository usuariosRepository;
    @Autowired
    private TokenService tokenService;

    public List<UsuarioDTO> getAllUsers() {
        return usuariosRepository.findAll().stream().map(UsuarioDTO::new).toList();
    }
    public void addUser(UsuarioRequestDTO usuario) {
        Usuarios newUsuario = new Usuarios(usuario);
        usuariosRepository.save(newUsuario);

        valida(converterDTO(newUsuario));
    }

    public Usuarios autenticarUsuario(String email, String senha) {
        Usuarios usuario = usuariosRepository.findByEmail(email);

        if (usuario != null && usuario.getSenha().equals(senha)) {
            return usuario;
        } else {
            return null;
        }
    }
    public UsuarioDTO converterDTO(Usuarios user){
        return new UsuarioDTO(user);
    }
    public void valida(UsuarioDTO addUser) {
        Usuarios newUsuario = usuariosRepository.findByEmail(addUser.email());
//        if(Objects.nonNull(usuariosRepository.findByEmail(newUsuario.get().getEmail()))){
//            throw new RuntimeException("Usuario já existe");
//        }

        Token token = new Token(newUsuario);
        tokenService.saveConfirmationToken(token);
    }
}
