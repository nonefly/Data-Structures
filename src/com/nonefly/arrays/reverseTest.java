package com.nonefly.arrays;

import java.util.Arrays;

/**
 * void reverse(int[] a)
 * reverses the elements of a[]
 * @author nonefly
 * Jun 9, 2015
 */
public class reverseTest {
	private static void reverse(int[] a){
		if(a.length < 2)
			return;
		for (int i = 0; i < a.length/2; i++) {
			swap(a, i, a.length - i - 1);//woring:ArrayIndexOutOfBoundsException
		}
	}
	private static void swap(int[] a, int i, int j) {
		final int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	public static void main(String[] args) {
		int a[] = new int[(int) (Math.random()*10)];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random()*100);
		}
		System.out.println(Arrays.toString(a));
		reverse(a);
		System.out.println(Arrays.toString(a));
	}

}
