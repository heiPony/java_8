package com.pony.concurrent;

public class ThreadLocalTest {

    static ThreadLocal<String> local = new ThreadLocal<>();
    static void print(String str){
        System.out.println(str + " : " + local.get());
        local.remove();
    }

    public static void main(String[] args) {
        Thread threadA = new Thread(() -> {
            local.set("  local value A");
            print("threadA");
            System.out.println("threadA remove local value after : " + local.get());
        });
        Thread threadB = new Thread(() -> {
            local.set("  local value B");
            print("threadB");
            System.out.println("threadB remove local value after : " + local.get());
        });
        threadA.start();
        threadB.start();
    }
}
