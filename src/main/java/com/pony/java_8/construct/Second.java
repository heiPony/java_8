package com.pony.java_8.construct;

public class Second  extends First{
    public Second(){
        System.out.println("construct 2");
    }
    static {
        System.out.println("static 2");
    }
    {
        System.out.println("no static 2");
    }
}
