package com.nonefly.recursive;


/**
 * @author nonefly
 * 2015年8月27日
 */
public class Gcd {
	/** 
	 * 暴力尝试
	 */
	public static int gcd0(int a, int b) {
		if(a < 0 || b < 0)
			return -1;
		for (int i = a > b ? b : a; i > 1; i--) {
			if(a % i == 0 && b % i == 0)
				return i;
		}
		return 1;
	}
	/** 解法一 
	 * 欧几里得算法（辗转相除法）
	 * 求两个数(a b,假设a > b)最大公约数,
	 * 每次用较大数a除b取余,
	 * 余数c不为0则让较大数等于较小数，较小数等于余数,即:
	 * a = b; b= c;
	 */
	public static int gcd1(int a, int b) {
		if(a < 0 || b < 0)
			return -1;
		if(a == b || a == 0)
			return b;
		if(b == 0)
			return a;
		if(a < b)
			return gcd1(a, b % a);
		else
			return gcd1(b, a % b);
	}
	/**
	 * 更相减损术 来自《九章算术》
	 * ps:我也不知道这算法来头，只是知道算法思想，查后才知它的出处和名字~
	 * 
	 */
	public static int gcd2(int a, int b) {
		if(a < 0 || b < 0)
			return -1;
		if(a == b)
			return a;
		if((a & 1) > (b & 1))
			return gcd2(a, b >> 1);
		if((a & 1) < (b & 1))
			return gcd2(a >> 1, b);
		if((a & 1) == 0 && (b & 1) == 0)
			return gcd2(a >> 1, b >> 1) << 1;
		return gcd2(Math.abs(a - b), b > a ? a : b);
	}
	
	public static void main(String[] args) {
		System.out.println(gcd0(99, 66));
	}
}
