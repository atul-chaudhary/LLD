package com.atul.multThreading.oddEven;

public class OddEven {
    public static void main(String[] args) {
        Product product = new Product();
        Thread odd = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    product.printOdd();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread even = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    product.printEven();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        odd.start();
        even.start();
    }
}


class Product {
    int num = 1;

    public void printOdd() throws InterruptedException {
        while (true) {
            synchronized (this) {
                System.out.println("odd thread print number " + num++);
                Thread.sleep(1000);
                notify();
            }
        }
    }

    public void printEven() throws InterruptedException {
        while (true) {
            synchronized (this) {
                System.out.println("even Thread prints number " + num++);
                Thread.sleep(1000);
                notify();
            }
        }
    }


}
