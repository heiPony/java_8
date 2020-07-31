package com.pony.concurrent;

public class DeadLockTest {

    private static Object objA = new Object();
    private static Object objB = new Object();

    public static void main(String[] args) {
        Thread threadA = new Thread(() -> {
            synchronized (objA){
//                System.out.println(Thread.currentThread().getName());
//                System.out.println(Thread.currentThread().getPriority());
//                System.out.println(Thread.currentThread().getThreadGroup().getName());
                System.out.println(Thread.currentThread() + " get objA");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("---");
                }
                System.out.println(Thread.currentThread() + " is waiting  get objB");
                synchronized (objB){
                    System.out.println(Thread.currentThread() + " get objB");
                }
            }
        });
        Thread threadB = new Thread(() -> {
            synchronized (objB){
                System.out.println(Thread.currentThread() + " get objB");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("---");
                }
                System.out.println(Thread.currentThread() + " is waiting  get objA");
                synchronized (objA){
                    System.out.println(Thread.currentThread() + " get objA");
                }
            }
        });
        threadA.start();
        threadB.start();
    }


}
