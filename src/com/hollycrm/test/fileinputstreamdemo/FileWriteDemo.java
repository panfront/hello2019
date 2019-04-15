package com.hollycrm.test.fileinputstreamdemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileWriteDemo {
    public static void main(String[] args) throws Exception {
        FileOutputStream out =new FileOutputStream("d:/abc/o2");
        out.write(97);
        out.write(98);
        out.write(99);
        out.write(356);
        out.write(0xd6);
        out.write(0xd0);
        byte[] a = {101,102,103,104,105,106,107,108,109,110};
        out.write(a,0,10);
        out.write(a,3,5);
        out.close();
    }
}