package com.hollycrm.test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by panfront on 2019/4/9.
 */
public class ToStringTest {
    public static void main(String[] args) {
        Map<String,Object> param = new HashMap<>();
        param.put("abc",123);
        param.put("limit","20");
        String str ="50";
        if(param.get("limit") != null && param.get("limit").toString()!=""){
            str =param.get("limit").toString();
        }
        System.out.println(str);


    }
}
