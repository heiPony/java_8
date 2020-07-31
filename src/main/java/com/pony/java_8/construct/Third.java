package com.pony.java_8.construct;

public class Third  extends Second{
    public Third(){
        System.out.println("construct 3");
    }
    static {
        System.out.println("static 3");
    }
    {
        System.out.println("no static 3");
    }

}
