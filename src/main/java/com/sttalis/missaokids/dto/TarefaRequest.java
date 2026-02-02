package com.sttalis.missaokids.dto;

public class TarefaRequest {
    private Long paiId;
    private String titulo;
    private int valorEstrelas;
    private String imagemBase64;
    private Long atribuidaParaId;

    public Long getPaiId() { return paiId; }
    public void setPaiId(Long paiId) { this.paiId = paiId; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public int getValorEstrelas() { return valorEstrelas; }
    public void setValorEstrelas(int valorEstrelas) { this.valorEstrelas = valorEstrelas; }
    public String getImagemBase64() { return imagemBase64; }
    public void setImagemBase64(String imagemBase64) { this.imagemBase64 = imagemBase64; }
    public Long getAtribuidaParaId() { return atribuidaParaId; }
    public void setAtribuidaParaId(Long atribuidaParaId) { this.atribuidaParaId = atribuidaParaId; }
}