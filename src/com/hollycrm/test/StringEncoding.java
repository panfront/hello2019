package com.hollycrm.test;

import java.util.Arrays;

public class StringEncoding {
    public static void main(String[] args) throws Exception {
        String s = "abc中文";
        System.out.println(s);
        f(s,null);
        f(s,"GBK");
        f(s,"UTF-8");
    }
/*
 * charset 字符集
 * encoding字符编码
 */
    private static void f(String s, String charset) throws  Exception{
        byte [ ]a ;
        String b;
        if(charset ==null){
            a=s.getBytes();
            b=new String(a,"UTF-8");
        }else{
            a=s.getBytes(charset);
            b= new String(a,charset);
        }
        System.out.println(charset+"\t"+ Arrays.toString(a));
        System.out.println(b);

    }
}