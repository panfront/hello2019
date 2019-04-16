package com.hollycrm.test.encodingtransfer;

import java.io.UnsupportedEncodingException;

public class CharLength {
    public static void main(String[] args) throws Exception {
        String s = "一二三四a";
        byte [] bytes = s.getBytes();
        System.out.println("bytes.length:"+bytes.length);
        byte [] bytes2 = s.getBytes("GBK");
        System.out.println("bytes.length(GBK):"+bytes2.length);

    }
}