package com.nonefly.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * 运行时常量池导致内存溢出
 * 
 * 限制方法区大小，间接限制常量池容量
 * -XX:PermSize=5M 初始
 * -XX:MaxPermSize=5M 最大
 * 
 * @author nonefly
 * 2015年7月23日
 */
public class RuntimeConstantPoolOOM {
	
	/*
	 public static void main(String[] args) {
		String str1 = new StringBuilder("你好").append("世界").toString();
		System.out.println(str1.intern() == str1);
		
		//字符串"java"已经存在（但是我不知道他为什么会存在，什么时候存在的，除了它还有其他的什么是已经存在的？）
		String str2 = new StringBuilder("ja").append("va").toString();//false
		//String str2 = new StringBuilder("ja").append("va").toString();//true
		System.out.println(str2.intern() == str2);

	}
	*/
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		int i = 0;
		//jdk 1.6以及以前 会出现java.lang.OutOfMemoryError: PermGen space
		//而1.7种while()会一直循环下去
		while(true){
			list.add(String.valueOf(i++).intern());
		}
	}
}
