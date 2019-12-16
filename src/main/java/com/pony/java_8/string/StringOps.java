package com.pony.java_8.string;

import org.springframework.util.StringUtils;

public class StringOps {
    public static void main(String[] args) {

    }


    /**
     * String是否是回文(StringBuilder.reverse())
     * @Author huangzhanping
     * @param [str]
     * @return 2019/12/2 15:15
     */
    public static boolean isPalindrome(String str){
        if(StringUtils.isEmpty(str)){
            return false;
        }
        StringBuilder sbStr=new StringBuilder(str);
        sbStr.reverse();
        return sbStr.toString().equals(str);
    }
}
