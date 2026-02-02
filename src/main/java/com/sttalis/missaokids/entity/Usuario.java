package com.sttalis.missaokids.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String login;

    @Column(nullable = false)
    private String senha;

    private String perfil;
    private String familiaId;
    private String nomeExibicao;

    @Column(columnDefinition = "TEXT")
    private String fotoBase64;

    public Usuario() {}

    public Usuario(String login, String senha, String perfil, String familiaId, String nomeExibicao, String fotoBase64) {
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
        this.familiaId = familiaId;
        this.nomeExibicao = nomeExibicao;
        this.fotoBase64 = fotoBase64;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }
    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }
    public String getPerfil() { return perfil; }
    public void setPerfil(String perfil) { this.perfil = perfil; }
    public String getFamiliaId() { return familiaId; }
    public void setFamiliaId(String familiaId) { this.familiaId = familiaId; }
    public String getNomeExibicao() { return nomeExibicao; }
    public void setNomeExibicao(String nomeExibicao) { this.nomeExibicao = nomeExibicao; }
    public String getFotoBase64() { return fotoBase64; }
    public void setFotoBase64(String fotoBase64) { this.fotoBase64 = fotoBase64; }
}