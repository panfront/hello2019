package com.hollycrm.test.review_Throwable;

import java.util.Objects;

public class EvaluateObjectNull {
    public static void main(String[] args) {
        Object obj = null;

        try {
            System.out.println(Objects.requireNonNull(obj));
            System.out.println(123);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(Objects.requireNonNull(obj,"obj为空"));
    }
}
