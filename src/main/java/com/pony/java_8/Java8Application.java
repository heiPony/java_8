package com.pony.java_8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
@EnableScheduling
@SpringBootApplication
public class Java8Application {

    public static void main(String[] args) {
        SpringApplication.run(Java8Application.class, args);
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            System.out.println(random.nextInt());
        }
    }



    @Scheduled(cron = "30 4 16 ? * WED")
    public static void sys(){
        System.out.println("=====");
    }


    public static void getDays() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        long day = 60 * 60 * 24 * 1000;
        try {
            Date date2 = format.parse("2022-6-8");
            long time = date2.getTime() - new Date().getTime();
            System.out.println(time / day);
            long times = format.parse("2019-10-4").getTime() - format.parse("2019-09-20").getTime();
            System.out.println(times / day);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void time() {
        Long time = MyUtils.getTime(2, -3);
        Long tomorrow = MyUtils.getTime(5, 1);
        System.out.println("三月前的今天：" + MyUtils.longToStr(time, "yyyy-MM-dd"));
        System.out.println("明天：" + MyUtils.longToStr(tomorrow, "yyyy-MM-dd"));
    }

}
