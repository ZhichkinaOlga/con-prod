package com.zhichkina.component;

/**
 * Created by ozhichki on 13.10.2016.
 */
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
