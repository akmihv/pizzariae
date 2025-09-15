package com.itb.inf2em.pizzariae.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ItemPedido")
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private int quantidadeItem;
    @Column(nullable = false)
    private double codStatus;
    @Column(columnDefinition = "DECIMAL(5,2)", nullable = false)
    private boolean valorUnitario;

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }

    public void setQuantidadeItem(int quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }
    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    public void setCodStatus(double codStatus) {
        this.codStatus = codStatus;
    }
    public double getCodStatus() {
        return codStatus;
    }

    public void setValorUnitario(boolean valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    public boolean getValorUnitario() {
        return valorUnitario;
    }
}
