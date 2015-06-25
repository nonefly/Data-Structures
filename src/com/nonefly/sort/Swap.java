package com.nonefly.sort;
/**
 * 交换两个数，静态导入到其他类中
 * @author nonefly
 * Jun 21, 2015
 */
public class Swap {
	public static void swap(int[] a, int i, int j) {
		a[i] = a[i] ^ a[j];
		a[j] = a[i] ^ a[j];
		a[i] = a[i] ^ a[j];
	}
}