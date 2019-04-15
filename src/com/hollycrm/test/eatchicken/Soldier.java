package com.hollycrm.test.eatchicken;

import java.util.Random;

public class Soldier {
    Integer id = 0;
    Integer blood=100;
    Weapon weapon;
    public  void go( ){
        System.out.println(this.id+"号士兵前进");
    }
    public  void attack(){
        if(this.blood == 0){
            System.out.println("这是"+this.id+"号士兵的尸体");
            return;
        }
        System.out.println(this.id+"号士兵进攻");
        if(this.weapon!=null){
            if(this.weapon.bullets ==0){
                this.weapon.reload();
            }
            this.weapon.fire();
        }
        int d = new Random().nextInt(10);
        if(d>this.blood){
            d=this.blood;
        }
        this.blood-=d;
        System.out.println("血量："+this.blood);
        if(this.blood==0){
            System.out.println(this.id+"号士兵成盒子了");
        }
    }

}