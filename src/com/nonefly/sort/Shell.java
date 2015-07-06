package com.nonefly.sort;

/**
 * Shell(希尔)排序
 * Shell排序也是一种插入排序，O(n)平均等于n的1.5指数级
 * @author nonefly
 * Jun 25, 2015
 */
public class Shell {
	
	public static void sort(int[] a) {
		int d = 1, j, n = a.length;
		for ( ; d <= n/9; d = d*3 + 1);
		for ( ; d > 0; d /= 3) {
			for (int i = d; i < n; i++) {
				int ai = a[i];
				for ( j = i; j >= d && a[j-d] > ai; j -= d)
					a[j] = a[j-d];
				a[j] = ai;
			}
		}
	}
}
