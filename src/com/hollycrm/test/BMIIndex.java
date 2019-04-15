package com.hollycrm.test;

import java.util.Scanner;

/**
 * Created by panfront on 2019/4/11.
 */
public class BMIIndex {
    public static void main(String[] args) {
        System.out.print("输入体重：");
        double weight = new Scanner(System.in).nextDouble();
        System.out.println();
        System.out.print("输入身高：");
        double height = new Scanner(System.in).nextDouble();
        f(weight,height);


    }

    private static void f(double weight, double height) {
        double BMI = weight/(height*height)*10000;
        System.out.println("BMI:"+BMI);
        String result="";
        if (BMI<18.5){
            result="过轻";
        }else if (BMI<22.9){
            result="正常";
        }else if(BMI<24.9 ){
            result="偏胖";
        }else if(BMI<29.9){
            result="肥胖";
        }else if(BMI<40){
            result="重度肥胖";
        }else{
            result="极度肥胖";
        }
        System.out.println(result);
    }


}
