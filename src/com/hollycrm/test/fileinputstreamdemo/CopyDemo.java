package com.hollycrm.test.fileinputstreamdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class CopyDemo {
    public static void main(String[] args) {
        System.out.println("源文件：");
        String s1 = new Scanner(System.in).nextLine();
        File sourceFile = new File(s1);
        if (!sourceFile.isFile()) {
            System.out.println("请输入正确的文件路径");
            return;
        }
        System.out.println("目标文件：");
        String s2 = new Scanner(System.in).nextLine();
        File toFile = new File(s2);
        if (toFile.isDirectory()) {
            System.out.println("请指定一个具体文件，而不是文件夹");
            return;
        }
        try {
            copy(sourceFile, toFile);
            System.out.println("FINISH");
        } catch (Exception e) {
            System.out.println("FAILED");
            e.printStackTrace();
        }
    }

    private static void copy(File sourceFile, File toFile) throws Exception {
        FileInputStream in = new FileInputStream(sourceFile);
        FileOutputStream out = new FileOutputStream(toFile);
        byte[] buff = new byte[8192];
        int count;
        while ((count = in.read(buff)) != -1) {
            out.write(buff, 0, count);
        }
        in.close();
        out.close();
    }
}