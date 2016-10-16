package com.zhichkina.component;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by ozhichki on 13.10.2016.
 */
public class ItemQueue {

    private final Queue<Item> queue;

    public ItemQueue() {
        this.queue = new ArrayDeque<>(3);
    }

    public Item take() {
        return queue.poll();
    }

    public void add(Item item) {
        queue.add(item);
    }
}
