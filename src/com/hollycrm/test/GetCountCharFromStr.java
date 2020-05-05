package com.hollycrm.test;

public class GetCountCharFromStr {
    public static void main(String[] args) {
        String str = "qwqer,qwe,qwe,";
        System.out.println(getCount(str,','));


    }
    static int getCount(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

}
