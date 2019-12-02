package com.pony.java_8.regular;

import com.pony.java_8.RegUtils;

public class RegularController {

    public static void main(String[] args) {
        testIntAll();


    }
    public static void testIntAll(){
        System.out.println("211".matches(RegUtils.NUM_INT_ALL));
        System.out.println("2111".matches(RegUtils.NUM_INT_NUM));
    }




}
