package com.sttalis.missaokids.controller;

import com.sttalis.missaokids.entity.Usuario;
import com.sttalis.missaokids.repository.RecompensaRepository;
import com.sttalis.missaokids.repository.TarefaRepository;
import com.sttalis.missaokids.repository.UsuarioRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private final UsuarioRepository usuarioRepository;
    private final TarefaRepository tarefaRepository;
    private final RecompensaRepository recompensaRepository;
    private final PasswordEncoder passwordEncoder;

    public AdminController(UsuarioRepository usuarioRepository,
                           TarefaRepository tarefaRepository,
                           RecompensaRepository recompensaRepository,
                           PasswordEncoder passwordEncoder) {
        this.usuarioRepository = usuarioRepository;
        this.tarefaRepository = tarefaRepository;
        this.recompensaRepository = recompensaRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping
    public String dashboard(Model model) {
        model.addAttribute("usuarios", usuarioRepository.findAll());
        model.addAttribute("tarefas", tarefaRepository.findAll());
        model.addAttribute("recompensas", recompensaRepository.findAll());
        return "admin/dashboard";
    }

    @PostMapping("/cadastrar")
    public String cadastrar(Usuario usuario) {
        usuario.setSenha(passwordEncoder.encode(usuario.getSenha()));

        if (usuario.getPerfil() == null || usuario.getPerfil().isEmpty()) {
            usuario.setPerfil("ROLE_RESPONSAVEL");
        }

        if (usuario.getNomeExibicao() == null || usuario.getNomeExibicao().isEmpty()) {
            usuario.setNomeExibicao(usuario.getLogin());
        }

        if (usuario.getFamiliaId() == null || usuario.getFamiliaId().isEmpty()) {
            usuario.setFamiliaId(UUID.randomUUID().toString());
        }

        usuarioRepository.save(usuario);
        return "redirect:/admin";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Long id) {
        usuarioRepository.deleteById(id);
        return "redirect:/admin";
    }
}