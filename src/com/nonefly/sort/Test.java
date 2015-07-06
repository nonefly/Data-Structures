package com.nonefly.sort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/**
 * 测试排序
 * @author nonefly
 * Jun 21, 2015
 */
public class Test {
	int i = 1;
	public static void main(String[] args) {
		//int[] a = {233,42};
		int[] a = {99,3,4,21,41,211,511,927,22,1};
		Bubbble.sort(a);//冒泡
		//Selection.sort(a);//选择
		//Insertion.sort(a);//插入
		//Shell.sort(a);//希尔
		//Quick.sort(a);
		System.out.println(Arrays.toString(a));
		//Map<K, V> m= new HashMap<K, V>();
	}
}
