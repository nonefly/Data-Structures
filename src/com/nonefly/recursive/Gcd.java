package com.nonefly.recursive;


/**
 * 
 * @author nonefly
 * Aug 28, 2015
 */
public class Gcd {
	/** 
	 * ��������
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
	/** �ⷨһ 
	 * ŷ������㷨��շת�������
	 * ��������(a b,����a > b)���Լ��,
	 * ÿ���ýϴ���a��bȡ��,
	 * ����c��Ϊ0���ýϴ������ڽ�С������С����������,��:
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
	 * ��������� ���ԡ�����������
	 * ps:��Ҳ��֪�����㷨��ͷ��ֻ��֪���㷨˼�룬����֪���ĳ���������~
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
