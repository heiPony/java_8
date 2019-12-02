package com.pony.java_8.string;

import org.springframework.util.StringUtils;

public class StringOps {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abc"));
        System.out.println(isPalindrome("abcdcba"));
    }


    public static boolean isPalindrome(String str){
        if(StringUtils.isEmpty(str)){
            return false;
        }
        StringBuilder sbStr=new StringBuilder(str);
        sbStr.reverse();
        return sbStr.toString().equals(str);
    }
}
