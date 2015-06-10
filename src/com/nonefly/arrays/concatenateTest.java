package com.nonefly.arrays;

import java.util.Arrays;

/**
 * reurn an array concaining all of a[] followed by all of b[]
 * 
 * @author nonefly Jun 9, 2015
 */
public class concatenateTest {

	private static Object[] concatenate(Object[] a, Object[] b) {
		final Object[] c = new Object[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = a.length; i < c.length; i++) {
			c[i] = b[i - a.length];
		}
		return c;
	}

	public static void main(String[] args) {
		String[] a = { "aa", "bb", "cc", "dd" };
		String[] b = { "aa", "bb", "cc", "dd" };

		System.out.println(Arrays.toString(concatenate(a, b)));
	}

}
