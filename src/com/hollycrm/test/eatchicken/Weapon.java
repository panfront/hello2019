package com.hollycrm.test.eatchicken;

import java.util.Random;

public class Weapon {
    String name;
    Integer bullets = 0;

    public Weapon(String name) {
        this(name, 100);
    }

    public Weapon(String name, Integer bullets) {
        this.name = name;
        this.bullets = bullets;
    }

    public void fire() {
        System.out.println("开火");
        //产生随机的发射子弹数量
        int r = 3 + new Random().nextInt(10);
        if (r > this.bullets){
            r=this.bullets;
        }
        this.bullets-=r;
        for (int i = 0; i <r ; i++) {
            System.out.print("突");
        }
        System.out.println("~");
        System.out.println("剩余子弹："+this.bullets);
    }
    public  void reload( ){
        this.bullets = 100;
    }
}