package com.nonefly.jvm;

import java.lang.reflect.Field;

import sun.misc.Unsafe;

/**
 * 使用unsafe分配本机内存
 * -Xmx20M -XX:MaxDirectMemorySize=10M
 * 
 * java.lang.OutOfMemoryError本机直接内存溢出
 * 
 * @author nonefly
 * 2015年7月23日
 */
public class DirectMemoryOOM {
	
	private static final int _1MB = 1024 * 1024;
	
	public static void main(String[] args) throws Exception {
		Field unsafeField = Unsafe.class.getDeclaredFields()[0];
		unsafeField.setAccessible(true);
		Unsafe unsafe = (Unsafe) unsafeField.get(null);
		while(true)
			unsafe.allocateMemory(_1MB);
	}
}
