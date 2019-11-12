package com.hollycrm.test;

public class ConflictTest {
    public static void main(String[] args) {
        int sum = 0;
        for (int x = 0; x < 10; x++) {
            sum+= x;
            if (x%3 ==0){
                break;
            }
        }
        System.out.println(sum);
       int x =10;
       double y=20.2;
       long z = 10L;
       String str = ""+x+y*z;
        System.out.println(str);
    }
}
