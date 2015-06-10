package com.nonefly.list;

import java.util.Stack;


/**
 * 顺序表操作
 * @author nonefly
 * 
 */
public class Test {
	public static void main(String[] args) {
		MyList<String> list = null;
		
		//list = new MyArrayList<String>();
		list = new MyLinkList<String>();

		//增
		list.add("hello");
		list.add("world");
		list.add("nonefly");
		//改
		System.out.println(list);
		System.out.println("表长度为："+list.length());//长度
		list.insert(2, null);//注意验证元素null存取
		System.out.println(list);
		System.out.println("表长度为："+list.length());//长度
		list.insert(3, "I am");
		System.out.println(list);
		//删
		list.delete(1);
		System.out.println(list);
		//查询
		System.out.println("表长度为："+list.length());//长度
		System.out.println("null元素所在索引："+list.indexOf(null));//输出1
		System.out.println("'world'元素所在索引："+list.indexOf("world"));//已删除，输出-1，便是错误
	}
	
}
