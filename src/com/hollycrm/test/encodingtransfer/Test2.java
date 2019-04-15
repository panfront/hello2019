package com.hollycrm.test.encodingtransfer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Test2 {
    public static void main(String[] args) throws Exception {
        InputStreamReader in = new InputStreamReader(new FileInputStream("d:/abc/f3"));
        int s =in.read();
    }
}