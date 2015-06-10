package com.nonefly.arrays;

import java.util.Arrays;

/**
 * @author nonefly
 * 2015-6-8
 */
public class Test6 {
	/**
	 * boolean isSorter(int[] a)
	 * return true iff a[]<=a[1]...<=a[a.length-1]
	 */
	private static boolean isSorted(int[] a){
		if(a.length < 2)
			return true;
		for (int i = 0; i < a.length - 1; i++) {
			if(a[i] > a[i+1])
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int a[] = new int[(int) (Math.random()*10)];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random()*100);
		}
		System.out.println(Arrays.toString(a));
		System.out.println(isSorted(a));
	}
}
