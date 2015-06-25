package com.nonefly.sort;

import java.util.Arrays;
/**
 * 测试排序
 * @author nonefly
 * Jun 21, 2015
 */
public class Test {
	public static void main(String[] args) {
		int[] a = {3,42,2,4,2,5,27};
		//Bubbble.sort(a);
		//Selection.sort(a);
		Insertion.sort(a);
		System.out.println(Arrays.toString(a));
	}
}
