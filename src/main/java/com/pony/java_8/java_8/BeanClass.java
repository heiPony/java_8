package com.pony.java_8.java_8;

import com.pony.java_8.pojo.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

public class BeanClass {
    static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Map<Object, Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }


    public static List<User> userList() {
        List<User> userList = new ArrayList<>();
        userList.add(new User(1L, "huang", "123", 11, 11));
        userList.add(new User(2L, "huang", "123", 13, 10));
        userList.add(new User(3L, "huang", "123", 11, 30));
        userList.add(new User(4L, "huang", "123", 12, 40));
        userList.add(new User(5L, "huang", "123", 11, 11));
        return userList;
    }

    public static List<Integer> intList() {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(1);
        return intList;
    }


}
