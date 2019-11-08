package com.pony.java_8.java_8;

import com.pony.java_8.pojo.User;

import java.util.List;

public class Java_8_arithmetic extends  BeanClass {

    public static void main(String[] args) {
        //list集合求和
        System.out.println("============intReduce============");
        intReduce();
        //list集合根据某个字段求和(reduce)
        System.out.println("============listReduce============");
        listReduce();
        //list集合根据某个字段求和(sum)
        System.out.println("============mapToIntSum============");
        mapToIntSum();
    }


    //单纯的数字集合求和(reduce)
    public static void intReduce(){
        List<Integer> intList = intList();
        Integer integer = intList.stream().reduce((i, j) -> i + j).get();
        System.out.println(integer);
    }
    //list集合根据某个字段求和(reduce)
    public static void listReduce(){
        List<User> intList = userList();
        Integer integer = intList.stream().map(User::getAge).reduce((x,y)->x+y).get();
        System.out.println(integer);
    }
    //list集合根据某个字段求和(mapToInt().sum())
    public static void mapToIntSum(){
        List<User> intList = userList();
        Integer integer = intList.stream().mapToInt(User::getAge).sum();
        System.out.println(integer);
    }
}
