package com.zhichkina.component;

public class Consumer implements Runnable {
    private final ItemQueue queue;
    private final String name;

    public Consumer(ItemQueue queue, String name) {
        this.queue = queue;
        this.name = name;
        System.out.println("Consumer created, name = " + name);
    }

    @Override
    public void run() {

        while (true) {
            synchronized (queue) {
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Item item = queue.take();
                if (item != null) {
                    System.out.println(String.format("Consumer [%s] consumes item [%s] produced by [%s]", name, item.getId(), item.getProducer()));
                } else {
                    System.out.println(String.format("Consumer [%s] consumes null", name));
                }
            }
        }
    }
}
