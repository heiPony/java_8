package com.pony.java_8.arithmetic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Arithmetic {

    private static Logger logger = LoggerFactory.getLogger(Arithmetic.class);

    public static void main(String[] args) {
        String hCode="22";
        Boolean isOk=hCode.hashCode()=="22".hashCode();
        System.out.println(hCode.hashCode()=="23".hashCode());
        hCode.equals("22");



    }


    /**
     *
     * @Author huangzhanping
     * @param
     * @return 2019/12/16 13:40
     */
    public static void primeNum(int num) {
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                System.out.println(num+"是素数");
                return;
            }
        }
        System.out.println(num+"不是素数");
    }


    /**
     * 生兔子算法
     * @Author huangzhanping
     * @param [monthNum]
     * @return 2019/12/16 13:39
     */
    public static int getNum(int monthNum) {
        int num = 1;
        if (monthNum == 1 || monthNum == 2) {
            return num;
        }
        int a = 1;
        int b = 1;
        for (int i = 3; i <= monthNum; i++) {
            num = a + b;
            a = b;
            b = num;
        }

        return num;
    }

    /**
     * 生兔子算法
     * @Author huangzhanping
     * @param [monthNum]
     * @return 2019/12/16 13:39
     */
    public static int num(int monthNum) {
        if (monthNum == 1 || monthNum == 2) {
            return 1;
        }
        return num(monthNum - 1) + num(monthNum - 2);
    }
}
