package com.hollycrm.test.encodingtransfer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Test1 {
    public static void main(String[] args) throws Exception {
        f("d:/abc/f3","GBK");
        f("d:/abc/f4","UTF-8");
    }

    private static void f(String path, String charset) throws Exception {
        OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(path),charset);
        int count = 0;
        for (char i= '\u4e00'; i<'\u9fa5' ; i++) {
            out.write(i);
            count++;
            if(count ==30){
                out.write("\n");
                count=0;
            }
        }
        out.close();
    }
}