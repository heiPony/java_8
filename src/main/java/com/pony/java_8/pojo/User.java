package com.pony.java_8.pojo;

import org.springframework.stereotype.Repository;

@Repository
public class User {
    private Long id;
    private String name;
    private String password;
    private Integer age;
    private Integer num;

    public User(Long id, String name, String password, Integer age, Integer num) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.num = num;

    }

    public User() {
    }

    public User(User user) {
        this.id = user.id;
        this.name = user.name;
        this.password = user.password;
        this.age = user.age;
        this.num = user.num;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "User{id="+id+",age=" + age + ", num="+num+'}';
    }
}
