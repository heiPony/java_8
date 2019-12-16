package com.pony.java_8.jihe;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Controller {
    public static void main(String[] args) {
        List<Object> linkedList = new LinkedList<>();
        for(int i=1;i<10;i++){
            linkedList.add(i);
        }
        linkedList.remove(5);
        for(int i=1;i<10;i++){
            linkedList.remove(8-i);
        }
        List<Object> arrayList = new ArrayList<>();
        for(int i=1;i<10;i++){
            arrayList.add(i);
        }
        for(int i=1;i<10;i++){
            arrayList.remove(9-i);
        }

    }

    public static void list(){
        for (int j=1;j<=100;j++){
            List<Object> arrayList = new ArrayList<>();
            Long time=System.currentTimeMillis();
            for(int i=1;i<5000000;i++){
                arrayList.add(i);
            }
            System.out.println(System.currentTimeMillis()-time);
            Long times=System.currentTimeMillis();
            List<Object> linkedList = new LinkedList<>();
            for(int i=1;i<5000000;i++){
                linkedList.add(i);
            }
            System.out.println(System.currentTimeMillis()-times);
            System.out.println();
        }
    }

}
