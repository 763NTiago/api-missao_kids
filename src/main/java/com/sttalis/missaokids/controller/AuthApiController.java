package com.sttalis.missaokids.controller;

import com.sttalis.missaokids.dto.UsuarioResponse;
import com.sttalis.missaokids.entity.Usuario;
import com.sttalis.missaokids.repository.UsuarioRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AuthApiController {

    private final UsuarioRepository repository;
    private final PasswordEncoder passwordEncoder;

    public AuthApiController(UsuarioRepository repository, PasswordEncoder passwordEncoder) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
    }

    public record LoginRequest(String login, String senha) {}

    @PostMapping("/login")
    public ResponseEntity<?> fazerLogin(@RequestBody LoginRequest request) {
        Optional<Usuario> usuarioOpt = repository.findByLogin(request.login());

        if (usuarioOpt.isPresent()) {
            Usuario usuario = usuarioOpt.get();
            if (passwordEncoder.matches(request.senha(), usuario.getSenha())) {
                UsuarioResponse response = new UsuarioResponse(
                        usuario.getId(),
                        usuario.getLogin(),
                        usuario.getPerfil()
                );
                return ResponseEntity.ok(response);
            }
        }

        return ResponseEntity.status(401).body("Usuário ou senha inválidos");
    }
}