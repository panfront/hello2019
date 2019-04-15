package com.hollycrm.test;

import java.util.Optional;
import java.util.Random;

public class EatingChicken {
    public static void main(String[] args) {
        String a = null;
        System.out.println("a=" + a);
        Object s = Optional.ofNullable(a);
        System.out.println("a=" + s);
    }
}