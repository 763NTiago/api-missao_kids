package com.sttalis.missaokids.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tarefas")
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private int valorEstrelas;

    @Column(columnDefinition = "TEXT")
    private String imagemBase64;

    private String familiaId;
    private Long atribuidaParaId;
    private boolean concluida = false;

    public Tarefa() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public int getValorEstrelas() { return valorEstrelas; }
    public void setValorEstrelas(int valorEstrelas) { this.valorEstrelas = valorEstrelas; }
    public String getImagemBase64() { return imagemBase64; }
    public void setImagemBase64(String imagemBase64) { this.imagemBase64 = imagemBase64; }
    public String getFamiliaId() { return familiaId; }
    public void setFamiliaId(String familiaId) { this.familiaId = familiaId; }
    public Long getAtribuidaParaId() { return atribuidaParaId; }
    public void setAtribuidaParaId(Long atribuidaParaId) { this.atribuidaParaId = atribuidaParaId; }
    public boolean isConcluida() { return concluida; }
    public void setConcluida(boolean concluida) { this.concluida = concluida; }
}