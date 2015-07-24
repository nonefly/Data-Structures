package com.nonefly.jvm;
/**
 * 递归调用使得栈溢出
 * java.lang.StackOverflowError
 * 
 * -Xss128K
 * @author nonefly
 * 2015年7月21日
 */
public class StackOverflow{
	
	private int stackLength = 1;
	
	public void stackLeak(){
		++stackLength;
		stackLeak();
	}
	
	public static void main(String[] args) {
		StackOverflow stackOverflow = new StackOverflow();
		try{
			stackOverflow.stackLeak();
		}catch (Throwable e){
			System.out.println("stackLength:" + stackOverflow.stackLength);
			throw e;
		}
	}
}