package com.itb.inf2em.pizzariae.model.entity;

import java.time.LocalDateTime;

public class Pedido {

    private Long id;
    private double valorPedido;
    private LocalDateTime dataHoraEntrega;
    private LocalDateTime dateHoraEntrega;
    private String status;
    private boolean codStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(double valorPedido) {
        this.valorPedido = valorPedido;
    }

    public LocalDateTime getDataHoraEntrega() {
        return dataHoraEntrega;
    }

    public void setDataHoraEntrega(LocalDateTime dataHoraEntrega) {
        this.dataHoraEntrega = dataHoraEntrega;
    }

    public LocalDateTime getDateHoraEntrega() {
        return dateHoraEntrega;
    }

    public void setDateHoraEntrega(LocalDateTime dateHoraEntrega) {
        this.dateHoraEntrega = dateHoraEntrega;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isCodStatus() {
        return codStatus;
    }

    public void setCodStatus(boolean codStatus) {
        this.codStatus = codStatus;
    }
}
