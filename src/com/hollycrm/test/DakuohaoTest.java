package com.hollycrm.test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DakuohaoTest {
    public static void main(String[] args) {
        String msg = "尊敬的用户，截至当前，您已订购以下业务：\\r\\n-主套餐：[PRODUCT_NAME]；[zzyw][llb]\\r\\n如需查询更多业务，可登陆中国联通手机营业厅，首页依次点击“我的”—“我已订购”。";
        List<String> list = extractMessageByRegular(msg);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i+"-->"+list.get(i));
        }
    }
    /**
     * 使用正则表达式提取大括号中的内容
     * @param msg
     * @return
     */
    public static List<String> extractMessageByRegular(String msg){
        List<String> list=new ArrayList<String>();
        Pattern p = Pattern.compile("\\[(.*?)]");
        Matcher m = p.matcher(msg);
        while(m.find()){
            list.add(m.group().substring(1, m.group().length()-1));
        }
        return list;
    }

}
