package com.pony.java_8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyUtils {
    public static final String YEAR_SECOND="yyyy-MM-dd HH:mm:ss";
    public static final String YEAR_DAY="yyyy-MM-dd";

    /**
     * 获取时间戳：已今天为起点type：相差类型、num：相差数量
     * @Author huangzhanping
     * @param [type, num]
     * @return java.lang.Long
     * Date 2019/10/13 18:03
     */
    public static Long getTime(int type,int num) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date());
        instance.add(type,num);
        return instance.getTime().getTime()/1000L;
    }

    /**
     * 获取时间戳：时间、时间类型
     * @Author huangzhanping
     * @param [date, format]
     * @return java.lang.Long
     * Date 2019/10/13 18:09
     */
    public static Long strToLong(String date,String format){
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        Long longTime=0L;
        try {
            Date parse = dateFormat.parse(date);
            longTime=parse.getTime()/1000L;
        } catch (ParseException e) {
        }
        return longTime;
    }
    /**
     * 
     * @Author huangzhanping
     * @param [date, format]
     * @return java.lang.String
     * Date 2019/10/13 18:11
     */
    public static String longToStr(Long date,String format){
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(date*1000L);
    }

}
