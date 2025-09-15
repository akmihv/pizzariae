package com.itb.inf2em.pizzariae.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 45, nullable = false)
    private String nome;
    @Column(length = 255, nullable = true)
    private String descricao;
    private boolean codStatus;

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setCodStatus(boolean codStatus) {
        this.codStatus = codStatus;
    }
    public boolean getCodStatus() {
        return codStatus;
    }
}


