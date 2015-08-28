package com.nonefly.recursive;

/**
 * 斐波那契数列
 * 
 * @author nonefly
 * 2015年8月26日
 */
public class Fib {
	/**
	 * 递归实现
	 * 
	 * @param n 求第n个
	 * @return 结果
	 */
	public static int fib1(int n) {
		if (n < 2)
			return n;
		return fib1(n - 1) + fib1(n - 2);
	}

	/** 迭代 */
	public static int fib2(int n) {
		if (n < 2)
			return n;
		int first = 0, second = 1, now = 2;
		for (int i = 2; i <= n; i++) {
			now = first + second;
			first = second;
			second = now;
		}
		return now;
	}

	/** 动态规划 */
	public static int fib3(int n) {
		if (n < 2)
			return n;
		int f[] = new int[n+1];
		f[0] = 0;
		f[1] = 1;
		for (int i = 2; i <= n; i++) {
			f[i] = f[i-1] + f[i-2];
		}
		return f[n];
	}

	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) { 
			System.out.println("第"+i+"个 : " + fib2(i));
		}
	}
}