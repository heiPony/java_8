package com.pony.java_8.pojo;

public class A {
    public String show(D dog){
        return ("a and d");
    }
    public String show(A obj){
        return ("a and a");
    }
    //创建对象时构造器的调用顺序是：先初始化静态成员，然后调用父类构造器，再初始化非静态成员，最后调用自身构造器。
    //多态--只会调用B和A共有的方法、、多态首先是继承  然后是方法重写
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();
        E e=new E();
        System.out.println(a2.show(b));
        System.out.println(a2.show(c));
        System.out.println(a2.show(d));
        System.out.println(b.show(d));
        System.out.println(b.show(e));
    }
}
class B extends A{
    public String show(B obj){
        return ("b and b");
    }
    public String show(A obj){
        return ("b and a");
    }
}
class C extends B{

}
class D extends B{

}
class E extends B{
    public String show(A obj){
        return ("E and a");
    }
    public String show(E obj){
        return ("E and E");
    }
}