package com.hollycrm.test.aboutio.aboutfile;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * 测试File类的基本用法
 */
public class TestFile {
    public static void main(String[] args) throws IOException {
        //File f = new File("d:/a.txt");
        File f = new File("d:\\a.txt");
        System.out.println(f); //打印出路径
        f.renameTo(new File("d:/bb.txt")); //修改文件名
        //获取项目路径
        System.out.println(System.getProperty("user.dir"));
        File f2 = new File("gg.txt");
        //f2.createNewFile();//未写路径默认是项目的路径
        //f2.delete();//删除文件
        System.out.println("file是否存在"+ f2.exists());
        System.out.println("file是否目录"+ f2.isDirectory());
        System.out.println("file是否文件"+ f2.isFile());
        System.out.println("file最后修改时间"+ new Date(f2.lastModified()));
        System.out.println("file的大小"+ f2.length());
        System.out.println("file的文件名"+ f2.getName());
        System.out.println("file的目录路径"+ f2.getPath());

        File f3 = new File("d:/a/b/c");
        boolean flag = f3.mkdir();
        System.out.println("mkdir是否成功"+flag);
        boolean flag2 = f3.mkdirs();
        System.out.println("mkdirs是否成功"+flag2);

    }
}
