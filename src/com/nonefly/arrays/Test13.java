package com.nonefly.arrays;

import java.util.Arrays;

/**
 * 计算给定字符串26个字母出现频率
 * @author nonefly
 * Jun 9, 2015
 */
public class Test13 {

	private static int[] tally(String s){
		int[] frequency = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char ch = Character.toUpperCase(s.charAt(i));
			if (Character.isLetter(ch)) {
				++frequency[ch-'A'];
			}
		}
		return frequency;
	}
	//mine
//	private static int[] tally(String s){
//		int a[] = new int[26];
//		for (int i = 0; i < s.length(); i++) {
//			char ch = s.charAt(i);
//			if(ch >= 'a' && ch <= 'z')
//				++a[ch-'a'];
//			if(ch >= 'A' && ch <= 'A')
//				++a[ch-'A'];
//		}
//		return a;
//	}
	public static void main(String[] args) {
		String s = "yasdfgsadfg2345769trhzzzzhjrteatrushzxia";
		System.out.println(Arrays.toString(tally(s)));
	}

}
