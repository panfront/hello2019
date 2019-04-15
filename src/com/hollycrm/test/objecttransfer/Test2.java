package com.hollycrm.test.objecttransfer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test2 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream( new FileInputStream("d:/abc/f2"));
        Student s = (Student) in.readObject();
        in.close();
        System.out.println(s);
    }
}