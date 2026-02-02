package com.sttalis.missaokids.repository;

import com.sttalis.missaokids.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByLogin(String login);
    List<Usuario> findByFamiliaIdAndPerfil(String familiaId, String perfil);
}