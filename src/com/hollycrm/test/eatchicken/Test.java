package com.hollycrm.test.eatchicken;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("欢迎进入刺激战场");
        Soldier[] a = new Soldier[100];
        for (int i = 0; i <a.length ; i++) {
            Soldier s =new Soldier();
            s.id=i+1;
            s.weapon=new Weapon("98K"+i+1);
            a[i]=s;
        }
        System.out.println("按回车执行");
        while(true){
            new Scanner(System.in).nextLine();
            for (int i = 0; i <a.length ; i++) {
                if (a[i].blood!=0){
                    a[i].attack();
                    System.out.println("----");
                }
            }
            System.out.println("\n\n--------------------------");
        }
    }
}