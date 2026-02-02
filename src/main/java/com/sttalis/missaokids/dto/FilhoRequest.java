package com.sttalis.missaokids.dto;

public class FilhoRequest {
    private Long paiId;
    private String nome;
    private String login;
    private String senha;
    private String fotoBase64;

    public Long getPaiId() { return paiId; }
    public void setPaiId(Long paiId) { this.paiId = paiId; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }
    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }
    public String getFotoBase64() { return fotoBase64; }
    public void setFotoBase64(String fotoBase64) { this.fotoBase64 = fotoBase64; }
}