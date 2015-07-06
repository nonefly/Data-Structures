package com.nonefly.sort;
/**
 * 插入排序
 * @author nonefly
 * Jun 25, 2015
 */
public class Insertion {
	
	public static void sort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int ai = a[i], j;
			//从已排好序的后面开始比较，在比较时完成元素的移动
			for (j = i; j > 0 && a[j-1] > ai; j--) {
				a[j] = a[j-1];
			}
			a[j] = ai;
		}
	}
}
