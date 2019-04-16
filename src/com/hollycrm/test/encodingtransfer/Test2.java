package com.hollycrm.test.encodingtransfer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Test2 {
    public static void main(String[] args) throws Exception {
        InputStreamReader in = new InputStreamReader(new FileInputStream("d:/abc/f4"));
        int s ;
        char[] buff = new char[2];
        while((s=in.read(buff))!=-1){
            System.out.print(new String(buff,0,s));
        }
        in.close();
    }
}