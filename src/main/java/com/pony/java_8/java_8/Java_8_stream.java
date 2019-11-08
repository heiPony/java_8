package com.pony.java_8.java_8;


import com.pony.java_8.pojo.User;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java_8_stream extends BeanClass {

    public static void main(String[] args) {
        //list集合转map集合、list集合排序、list集合去重、list集合根据属性去重、list集合求和、list集合根据某个字段求和
        //map集合转自定义list集合

        //list集合转map集合
        System.out.println("============listToMap============");
        listToMap();
        //list集合排序
        System.out.println("============listSorted============");
        listSorted();
        //map集合转自定义list集合
        System.out.println("============mapToList============");
        mapToList();
        //list集合去重
        System.out.println("============listDistinct============");
        listDistinct();
        //list集合根据属性去重
        System.out.println("============listDistinctByAttr============");
        listDistinctByAttr();


    }

    //list集合转map集合
    public static Map<Long, User> listToMap() {
        List<User> list = userList();
        //List转Map集合/取第一个key(key重复)
        System.out.println("List转Map集合/取第一个key(key重复)");
        Map<Long, User> userMap = list.stream().collect(Collectors.toMap(User::getId, a -> a, (k1, k2) -> k1));
        //Map集合遍历
        userMap.forEach((k, v) -> {
            System.out.println(k + "," + v);
        });
        //List转Map集合/取最后一个key(key重复)
        System.out.println("List转Map集合/取最后一个key(key重复)");
        Map<Long, User> userMap2 = list.stream().collect(Collectors.toMap(User::getId, a -> a, (k1, k2) -> k2));
        userMap2.forEach((k, v) -> {
            System.out.println(k + "," + v);
        });
        return userMap;

    }

    //list集合排序
    public static void listSorted() {
        List<User> userList = userList();
//        List集合排序***************第一升序、第二升序
        System.out.println("第一升序、第二升序");
        List<User> sort = userList.stream().sorted(Comparator.comparing(User::getAge).thenComparing(User::getNum)).collect(Collectors.toList());
        sort.forEach(System.out::println);
//        List集合排序***************第一降序、第二降序
        System.out.println("第一降序、第二降序");
        Stream<User> sorted = userList.stream().sorted(Comparator.comparing(User::getAge).reversed().thenComparing(User::getNum, Comparator.reverseOrder()));
        sorted.forEach(System.out::println);
    }

    //map集合转自定义list集合
    public static void mapToList() {
        Map<Long, User> userMap = listToMap();
        List<User> list = userMap.entrySet().stream().map(item -> new User(item.getValue())).collect(Collectors.toList());
        list.forEach(System.out::println);
    }

    // list根据对象去重
    public static void listDistinct() {
        List<Integer> intList = intList();
        List<Integer> distinctList = intList.stream().distinct().collect(Collectors.toList());
        distinctList.forEach(System.out::println);
    }

    //list 根据对象的属性去重
    public static void listDistinctByAttr() {
        List<User> userList = userList();
        //根据一个属性去重，保留第一个的对象
        System.out.println("去重(排序)，升序排列，保存第一个对象(下标最小的)");
        userList.stream().collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(User::getAge))), ArrayList::new)).forEach(System.out::println);
        System.out.println("去重(排序)，降序排列，保存第一个对象(下标最小的)");
        userList.stream().collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(User::getAge).reversed())), ArrayList::new)).forEach(System.out::println);
        //根据多个属性去重，保留第一个的对象
        System.out.println("去重(排序)，升序排列，保留第一个的对象(下标最小的)");
        userList.stream().collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(item -> item.getAge() + ";" + item.getNum()))), ArrayList::new)).forEach(System.out::println);
        System.out.println("去重（distinctByKey），保留第一个的对象(下标最小的)");
        userList.stream().filter(distinctByKey(item -> item.getAge() + ";" + item.getNum())).collect(Collectors.toList()).forEach(System.out::println);
    }


}




