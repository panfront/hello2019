package com.hollycrm.test.aboutstring;

/**
 * 测试可变字符序列
 */
public class TestStringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder();
        for (int i = 0; i <26 ; i++) {
            char temp = (char) ('a'+i);
            sb.append(temp);
        }
        System.out.println(sb);
        sb.reverse();  //倒序
        System.out.println(sb);
        sb.setCharAt(3, '高');  //替换指定位置的字符
        System.out.println(sb);
        sb.insert(3,'我').insert(3,'大');//链式调用
        System.out.println(sb);         //指定位置插入字符
        sb.delete(20,23);
        System.out.println(sb);         //删除区间
    }
}
