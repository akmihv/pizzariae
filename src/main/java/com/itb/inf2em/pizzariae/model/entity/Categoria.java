package com.itb.inf2em.pizzariae.model.entity;

public class Categoria {
    private Long id;
    private String nome;
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


