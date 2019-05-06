package com.hollycrm.test;

import java.util.Scanner;

public class NewDemo {
	public static void main(String[] args) {
		int abccount=0;//字母数
		int spacecount=0;//空格数
		int numcount=0;//数字数
		int othercount=0;//其他字符数

		String toString=new Scanner(System.in).nextLine();
		char [] ch=toString.toCharArray();

		for(int i=0;i<ch.length;i++) {
			if(Character.isLetter(ch[i])) {
				abccount++;
			}else if(Character.isDigit(ch[i])) {
				numcount++;
			}else if(Character.isSpaceChar(ch[i])){
				spacecount++;
			}else {
				othercount++;
			}
		}
		System.out.println("中英文字符数量："+abccount);
		System.out.println("空格数："+spacecount);
		System.out.println("数字数量："+numcount);
		System.out.println("其他字符数量:"+othercount);
	}
}
