package com.hollycrm.test.fileinputstreamdemo;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File f= new File("d:/abc/o2");
        f.createNewFile();
        System.out.println("文件名："+f.getName());
        System.out.println("父目录："+f.getParent());
        System.out.println("完整路径："+f.getAbsolutePath());
        System.out.println("是否存在："+f.exists());
        System.out.println("是否文件："+f.isFile());
        System.out.println("是否文件夹："+f.isDirectory());
        System.out.println("字节量/文件夹无效："+f.length());
        System.out.println("最近修改时间："+f.lastModified());
        long lastModifiedTime =f.lastModified()-43200000;
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(lastModifiedTime);
        System.out.println(calendar.getTime());
        String lastModifiedTimeFormat = formatter.format(calendar.getTime());
        System.out.println(lastModifiedTimeFormat);
    }
}