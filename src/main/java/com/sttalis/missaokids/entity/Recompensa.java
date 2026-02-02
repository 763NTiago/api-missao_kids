package com.sttalis.missaokids.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "recompensas")
public class Recompensa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private int custoEstrelas;
    private String familiaId;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public int getCustoEstrelas() { return custoEstrelas; }
    public void setCustoEstrelas(int custoEstrelas) { this.custoEstrelas = custoEstrelas; }
    public String getFamiliaId() { return familiaId; }
    public void setFamiliaId(String familiaId) { this.familiaId = familiaId; }
}