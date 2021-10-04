package com.disteoe.disteoeservice.entity.order;

import com.disteoe.disteoeservice.exceptiondisteoe.ExceptionItemOrder;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private final List<ItemOrder> itemOrders;
    private double total;

    public Cart() {
        itemOrders = new ArrayList<>();
        total = 0;
    }

    public double getTotal() {
        return total;
    }

    public Cart(List<ItemOrder> itemOrders, double total) {
        this.itemOrders = itemOrders;
        this.total = total;
    }

    public void addItem(ItemOrder itemOrder) throws ExceptionItemOrder {
        if (itemOrder == null) {
            throw new ExceptionItemOrder("Item do pedido não pode ser nulo");
        }

        itemOrders.add(itemOrder);
        total += (itemOrder.getQuantity() * itemOrder.getProduct().getPrice());
    }

    public void addItem(int i, int qt) throws ExceptionItemOrder {
        if (i < 0) {
            throw new ExceptionItemOrder("Index não pode ser negativo");
        }

        if (qt < 1) {
            throw new ExceptionItemOrder("Quantidade invalida");
        }

        ItemOrder itemOrder = itemOrders.get(i);
        itemOrder.setQuantity(itemOrder.getQuantity() + qt);

        total += (itemOrder.getProduct().getPrice() * qt);
    }

    public void removeItem(int i) throws ExceptionItemOrder {
        if (i < 0) {
            throw new ExceptionItemOrder("Index não pode ser negativo");
        }

        if (itemOrders.size() <= i) {
            throw new ExceptionItemOrder("Lista de produtos vazia");
        }

        ItemOrder itemOrder = itemOrders.remove(i);
        total -= (itemOrder.getQuantity() * itemOrder.getProduct().getPrice());
    }

    public void removeItem(int i, int qt) throws ExceptionItemOrder {
        if (i < 0 || i >= itemOrders.size()) {
            throw new ExceptionItemOrder("Index não pode ser negativo");
        }

        ItemOrder itemOrder = itemOrders.get(i);

        if (qt < 1 || qt > itemOrder.getQuantity()) {
            throw new ExceptionItemOrder("Quantidade invalida");
        }

        itemOrder.setQuantity(itemOrder.getQuantity() - qt);
        total -= (itemOrder.getProduct().getPrice() * qt);
    }


}
