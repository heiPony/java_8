package com.pony.concurrent;

/**
 * 守护线程_
 * @Author huangzhanping
 * @param
 * @return 2020/7/21 21:59
 */
public class DaemonTest {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
           for (;;){
                int i=1;
           }
        });
        thread.setDaemon(true);
        thread.start();
        System.out.println("thread is over");
    }
}
