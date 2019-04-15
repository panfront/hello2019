package com.hollycrm.test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JudgePhoneNo {
    public static void main(String[] args) {
        System.out.print("输入手机号");
        String phoneNo = new Scanner(System.in).nextLine();
        System.out.println( );
        judge(phoneNo);
    }

    private static void judge(String phoneNo) {
        Pattern p = Pattern.compile("^(\\d{1,12})\\s*$");
        Matcher m = p.matcher(phoneNo);
        if(!m.matches()){
            System.out.println("号码格式错误");
            return;
        }
        char c= phoneNo.charAt(10);
        int price = 0;
        switch (c){
            case '8' : price = 50;break;
            case '3' : price = 0;break;
            default : price=20;break;
        }
        System.out.println("价格是："+price);
    }
}