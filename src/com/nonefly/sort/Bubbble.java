package com.nonefly.sort;

import static com.nonefly.sort.Swap.swap;

/**
 * 冒泡排序
 * @author nonefly
 * Jun 21, 2015
 */
public class Bubbble {
	private static boolean isSorted;
	public static void sort(int[] a){
		//定义标志位，排好则不继续比较
		isSorted = true;
		for (int i = a.length - 1; i > 0; --i) {
			for (int j = 0; j < i; ++j) {
				if(a[j] > a[j+1]){
					swap(a, j, j+1);
					isSorted = false;
				}	
			}
			if(isSorted)
				break;
		}
	}
}
