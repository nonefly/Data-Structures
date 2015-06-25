package com.nonefly.sort;

import static com.nonefly.sort.Swap.swap;
/**
 * 选择排序
 * @author nonefly
 * Jun 21, 2015
 */
public class Selection {
	
	public static void sort(int[] a) {
		for (int i = a.length - 1; i > 0; --i) {
			int temp = 0;
			for (int j = 0; j < i; ++j)
				if(a[temp] < a[j])
					temp = j;
			swap(a, temp, i);
		}
	}
}
