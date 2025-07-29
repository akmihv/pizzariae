package com.itb.inf2em.pizzariae.model.entity;

public class ItemPedido {

    private Long id;
    private int quantidadeItem;
    private double codStatus;
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
