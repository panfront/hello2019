package com.hollycrm.test.encodingtransfer;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Test2 {
    public static void main(String[] args) throws Exception {
        InputStreamReader in = new InputStreamReader(new FileInputStream("d:/abc/f4"));
        int s ;
        long start = System.currentTimeMillis();
        while((s=in.read())!=-1){
            System.out.print((char) s);
        }
        long end = System.currentTimeMillis();
        System.out.println("\n----------------------------------------------------------------");
        System.out.println(end-start);
        in.close();
    }
}