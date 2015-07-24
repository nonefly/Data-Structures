package com.nonefly.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * 不断创建对象java堆堆溢出
 * java.lang.OutOfMemoryError: Java heap space
 * 
 * -verbose:gc 输出JVM GC情况
 * -Xms20M  
 * -Xmx20M 
 * -Xmn10M 
 * -XX:+PrintGCDetails 
 * -XX:SurvivorRatio=8
 * @author nonefly
 * 2015年7月21日
 */
public class HeapOutMemory {
	
	static class OOMobject{
	}
	
	public static void main(String[] args) {
		//链表保存以免被当作可回收对象
		List<OOMobject> list = new ArrayList<OOMobject>();
		while(true)
			list.add(new OOMobject());
	}
}
