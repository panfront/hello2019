package com.hollycrm.test;

import java.util.UUID;

public class TestUUID {
    public static void main(String[] args) {
        String str = UUID.randomUUID().toString();
        String str1 = str.replaceFirst("-", "");
        String str2 = str.replace("-", "");
        String str3 = str.replaceAll("-", "");
        System.out.println("str:"+str);
        System.out.println("str1:"+str1);
        System.out.println("str2:"+str2);
        System.out.println("str3:"+str3);


    }
}
