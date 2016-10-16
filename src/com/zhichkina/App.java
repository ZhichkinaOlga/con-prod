package com.zhichkina;

import com.zhichkina.component.Consumer;
import com.zhichkina.component.ItemQueue;
import com.zhichkina.component.Producer;

public class App {
    public static void main(String[] args) {
        ItemQueue queue = new ItemQueue();
        Producer producerX = new Producer(queue, "X");
        Producer producerY = new Producer(queue, "Y");
        Producer producerZ = new Producer(queue, "Z");
        new Thread(producerX).start();
        new Thread(producerY).start();
        new Thread(producerZ).start();

        Consumer consumerA = new Consumer(queue, "A");
        Consumer consumerB = new Consumer(queue, "B");
        Consumer consumerC = new Consumer(queue, "C");
        new Thread(consumerA).start();
        new Thread(consumerB).start();
        new Thread(consumerC).start();


    }
}
