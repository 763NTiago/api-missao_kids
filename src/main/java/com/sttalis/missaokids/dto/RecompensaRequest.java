package com.sttalis.missaokids.dto;

public class RecompensaRequest {
    private Long paiId;
    private String titulo;
    private int custoEstrelas;

    public Long getPaiId() { return paiId; }
    public void setPaiId(Long paiId) { this.paiId = paiId; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public int getCustoEstrelas() { return custoEstrelas; }
    public void setCustoEstrelas(int custoEstrelas) { this.custoEstrelas = custoEstrelas; }
}