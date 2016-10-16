package com.zhichkina.component;

public class Item {
    private String producer;
    private int id;

    public Item(String producer, int id) {
        this.producer = producer;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getProducer() {
        return producer;
    }
}
