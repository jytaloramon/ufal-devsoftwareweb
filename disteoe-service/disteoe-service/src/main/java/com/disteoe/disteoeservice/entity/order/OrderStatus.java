package com.disteoe.disteoeservice.entity.order;

public enum OrderStatus {

    CANCELED(0), PENDENTE(1), PROCESSING(2), INPROGRESS(3), FINISHED(4);

    private final int valor;

    OrderStatus(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
