package com.nonefly.jvm;
/**
 * 不用任何循环完成累加
 * @author nonefly
 * 2015年7月21日
 */
public class SumWithoutCycle {
	
	//注意static 加上才能使得每次值改变
	private static int sum = 0;
	
	public SumWithoutCycle(int n){
		sum += n;
		if(n > 0)
			//盗版递归
			 new SumWithoutCycle(--n);
	}
	public static void main(String[] args) {
		SumWithoutCycle sumWithoutCycle = new SumWithoutCycle(100);
		System.out.println(sumWithoutCycle.sum);
	}
}
