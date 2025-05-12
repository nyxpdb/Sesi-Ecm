package com.revisao.ecommerce.dto;

import com.revisao.ecommerce.entities.Pedido;

import java.time.format.DateTimeFormatter;
import java.time.ZoneId;

public class RelatorioPedidoDTO {

    private Long pedido;
    private String cliente;
    private String status;
    private String momento;

    public RelatorioPedidoDTO(Pedido entity) {
        this.pedido = entity.getId();
        this.cliente = entity.getCliente().getNome();
        this.status = entity.getStatus().toString();
        this.momento = entity.getMomento()
                .atZone(ZoneId.systemDefault())
                .format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
    }


    public Long getPedido() {
        return pedido;
    }

    public void setPedido(Long pedido) {
        this.pedido = pedido;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMomento() {
        return momento;
    }

    public void setMomento(String momento) {
        this.momento = momento;
    }
}
