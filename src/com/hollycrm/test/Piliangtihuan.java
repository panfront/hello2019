package com.hollycrm.test;

import java.util.HashMap;
import java.util.Map;

public class Piliangtihuan {
    public static void main(String[] args) {
        /*String str ="尊敬的用户，截至当前，您已订购以下业务：" +
                "\\r\\n-主套餐：{[TCNRCX_PRODUCT_NAME]}；增值业务：{[QRYSPINFO-PRODUCT_NAME]、[QRYSPINFO-START_DATE]}，流量包：{[businessSMFlowInfoList_PACKAGE_NAME]}\\r\\n如需查询更多业务，可登陆中国联通手机营业厅，首页依次点击“我的”—“我已订购”。";

        str = str.replace("{["+"TCNRCX_PRODUCT_NAME"+"]}","123");
        StringBuilder dakuohaoInnerStr= new StringBuilder(str);
        System.out.println(str);*/


        Map<String,Object> param =  new HashMap<>();
        param.put("aa",null);

        String str = String.valueOf(param.get("aa"));
        //str = (String)param.get("aa");
        //str = param.get("aa").toString();
        System.out.println(str+"123");
    }


}
