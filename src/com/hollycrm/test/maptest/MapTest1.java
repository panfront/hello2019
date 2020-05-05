package com.hollycrm.test.maptest;

import java.util.ArrayList;
import java.util.List;

public class MapTest1 {
    public static void main(String[] args) {
        int n = 11;
        int b = (n-1)/10 +1;
        System.out.println(b);

        List<String> list = new ArrayList<>();
        list.add("0");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list = list.subList(0,5);
        System.out.println(list);
     }
}
