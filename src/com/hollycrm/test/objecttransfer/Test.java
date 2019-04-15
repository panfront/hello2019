package com.hollycrm.test.objecttransfer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Test {
    public static void main(String[] args) throws Exception {
        Student s =new Student(1234,"盖伦","男",20);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("d:/abc/f2"));
        out.writeObject(s);
        out.close();

    }
}