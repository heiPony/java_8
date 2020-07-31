package com.pony.gc;


import java.util.HashMap;

public class RunController {
    private Object ins;
    public static void main(String[] args) {
        RunController m1 = new RunController();
        RunController m2 = new RunController();
        m1.ins = m2;
        m2.ins = m1;
        m1 = null;
        m2 = null;
        System.gc();
        System.out.println();
        HashMap<Object, Object> map = new HashMap<>();
    }
}
