package com.pony.java_8;


import java.util.concurrent.atomic.AtomicInteger;

public class Test {

    private static volatile int a = 1;
    private static AtomicInteger b = new AtomicInteger();

    public static void main(String[] args) {
//        thread();
//        thread_1();
        for (int i = 0; i < 10; i++) {
            System.out.println(b.incrementAndGet());
        }
    }

    private static void thread() {
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(() -> {
                try {
                    for (int j = 0; j < 10; j++) {
                        System.out.println("a =" + a++);
                        Thread.sleep(500);
                    }
                } catch (Exception e) {
                    System.out.println("--");
                }
            });
            threads[i].start();
        }

    }

    private static void thread_1() {
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(() -> {
                try {
                    for (int j = 0; j < 10; j++) {
                        System.out.println("b =" + b.incrementAndGet());
                        Thread.sleep(500);
                    }
                } catch (Exception e) {
                    System.out.println("--");
                }
            });
            threads[i].start();
        }

    }
}
