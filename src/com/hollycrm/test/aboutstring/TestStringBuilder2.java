package com.hollycrm.test.aboutstring;

/**
 * 测试可变字符序列
 */
public class TestStringBuilder2 {
    public static void main(String[] args) {
        /** 使用string进行字符串的拼接 */
        String str1 = "";
        long strBeginLeaveMemory = Runtime.getRuntime().freeMemory();//获取系统剩余内存空间
        long strBeginTime = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            str1 = str1 + i;//相当于产生了10000个对象,记忆容易造成系统崩溃
        }
        long strEndLeaveMemory = Runtime.getRuntime().freeMemory();//获取系统剩余内存空间
        long strEndTime = System.currentTimeMillis();
        System.out.println("String占用时间："+ (strEndTime-strBeginTime));
        System.out.println("String占用内存："+ (strBeginLeaveMemory-strEndLeaveMemory));
        StringBuilder sb1 = new StringBuilder("");
        long sbBeginTime = System.currentTimeMillis();
        long sbBeginLeaveMemory = Runtime.getRuntime().freeMemory();//获取系统剩余内存空间
        for (int i = 0; i < 5000 ; i++) {
            sb1.append(i);
        }
        long sbEndTime = System.currentTimeMillis();
        long sbEndLeaveMemory = Runtime.getRuntime().freeMemory();//获取系统剩余内存空间
        System.out.println("Sb占用时间："+ (sbEndTime-sbBeginTime));
        System.out.println("Sb占用内存："+ (sbBeginLeaveMemory-sbEndLeaveMemory));
    }
}
