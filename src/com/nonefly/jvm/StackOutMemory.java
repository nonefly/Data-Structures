package com.nonefly.jvm;
/**
 * 不断创建线程使得栈内存溢出
 * 
 * -Xss2M
 * @author nonefly
 * 2015年7月23日
 */
public class StackOutMemory{
	/**
	 * 在《深入理解Java虚拟机》中，作者提示到Windows平台虚拟机， Java的线程是映射到OS（操作系统）的内核线程上的，
	 * 因此执行此处代码可能导致OS假死（实践时成功"弄死"OS）
	 * 
	 * 运行结果:java.lang.OutOfMemoryError: unnable to creat new native thread
	 */
	private void dontStop(){
		while(true);
	} 
	
	public void stackLeakByThread(){
		while(true){
			Thread thread = new Thread(new Runnable() {

				@Override
				public void run() {
					dontStop();
				}
			});
			thread.start();
		}
	}
	
	public static void main(String[] args) {
		StackOutMemory som = new StackOutMemory();
		som.stackLeakByThread();
	}
}