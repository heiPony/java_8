package com.pony.java_8.controller;

import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class TestController {
    public static void main(String[] args) {
        List<Order> orderList = orderList();
        List<Customer> customerList = customerList();
        customerList.stream().map(Customer::getList).forEach(item->{
            System.out.println(item);
        });
//        test();
    }

    /**
     * 公司测试题
     *
     * @param []
     * @return 2019/11/20 15:03
     * @Author huangzhanping
     */
    public static void test() {
        List<Order> orderList = orderList();
        List<Customer> customerList = customerList();
        for (Customer customer : customerList) {
            List<Order> list = new ArrayList<>();
            for (Order order : orderList) {
                if (customer.getId() == order.getCustomerId()) {
                    list.add(order);
                }
            }
            customer.setList(list);
        }

        for (Customer customer : customerList) {
            if (CollectionUtils.isEmpty(customer.getList())) {
                continue;
            }
            customer.getList().forEach(System.out::println);
            System.out.println("========================");
        }
    }


    public static List<Customer> customerList() {
        List<Customer> list = new ArrayList<>();
        for (long i = 1; i <= 10; i++) {
            list.add(new Customer(i, "name_" + i));
        }
        return list;
    }

    public static List<Order> orderList() {
        List<Order> list = new ArrayList<>();
        for (long i = 1; i <= 10; i++) {
            list.add(new Order(i, "name_" + i, i));
        }
        return list;
    }
}
