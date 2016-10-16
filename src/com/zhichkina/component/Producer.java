package com.zhichkina.component;

import java.util.Random;

public class Producer implements Runnable {
    private final ItemQueue queue;
    private final String name;
    private int itemId;

    public Producer(ItemQueue queue, String name) {
        this.queue = queue;
        this.name = name;
        System.out.println("Producer created, name = " + name);
    }

    @Override
    public void run() {
        while (true) {
            synchronized (queue) {
                Item item = new Item(name, itemId++);
                System.out.println(String.format("[%s] -> item [%s]", name, item.getId()));
                queue.add(item);
                queue.notify();
            }
            try {
                Thread.sleep(new Random().nextInt(2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
