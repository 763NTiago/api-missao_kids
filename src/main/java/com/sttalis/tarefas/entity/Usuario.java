package com.sttalis.tarefas.entity;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "usuarios")
public class Usuario {

    @id
    @GeneratedValue(strategy = GenerationType. IDENTITY)
    private Long id;

    @Column(unique = true, neullable = false)
    private String login;

    @Column(nullable = false)
    private String senha;

    private String perfil;

    @ManyToOne
    @JoinColumn(name = "responsavel_id")
    private Usuario responsavel;
}
