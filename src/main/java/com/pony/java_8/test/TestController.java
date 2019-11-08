package com.pony.java_8.test;

public class TestController {

    public static void main(String[] args) {
        String myReg="^(-?\\d+)(\\.\\d+)?$";
        String intReg="^(-?\\d+)$";
        System.out.println("-222.2".matches(myReg));
        System.out.println("22w211".matches(intReg));
        System.out.println(Integer.MAX_VALUE);
    }
}
