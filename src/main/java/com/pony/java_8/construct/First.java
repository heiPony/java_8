package com.pony.java_8.construct;

public class First {

    public First(){
        System.out.println("construct 1");
    }
    static {
        System.out.println("static 1");
    }
    {
        System.out.println("no static 1");
    }
}
