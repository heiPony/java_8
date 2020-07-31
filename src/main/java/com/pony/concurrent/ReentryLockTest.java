package com.pony.concurrent;

public class ReentryLockTest {

    public synchronized void test(){
        System.out.println("A");
    }
    public synchronized void test_1(){
        System.out.println("B");
        test();
    }

    public static void main(String[] args) {

    }
}
