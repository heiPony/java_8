package com.pony.java_8.Construct;

public class 构造函数_静态方法_非静态方法 {
    public static void main(String[] args) {
        //顺序
        //1、第一级父类静态方法-->第二级父类静态方法-->第三级父类静态方法
        //2、第一级父类非静态方法、构造函数-->第二级父类非静态方法、构造函数-->第一级父类非静态方法、构造函数
        new Third();
    }
}
