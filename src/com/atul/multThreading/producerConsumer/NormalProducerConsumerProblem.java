package com.atul.multThreading.producerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class NormalProducerConsumerProblem {


    public static void main(String[] args) {

        Product product = new Product(1, new LinkedList<>());

        Thread producer = new Thread(() -> {
            try {
                product.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                product.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }


}

class Product {
    int capacity;
    Queue<Integer> pq;
    int current = 0;

    public Product(int capacity, Queue<Integer> pq) {
        this.capacity = capacity;
        this.pq = pq;
    }

    public void produce() throws InterruptedException {
        while (true) {
            synchronized (this) {
                if (pq.size() == capacity) {
                    wait();
                }
                int it = current++;
                System.out.println("producer produced the message with content " + it);
                pq.offer(it);
                notifyAll();
                Thread.sleep(1000);
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                if (pq.isEmpty()) {
                    wait();
                }

                System.out.println("Consumer consumes the message with content " + pq.poll());
                notifyAll();
                Thread.sleep(1000);
            }
        }
    }
}
