package com.nonefly.stack;
/**
 * 定义栈的基本操作
 * @author nonefly
 * 2015-5-24
 */
public interface MyStack<T> {
	
	/**
	 * 访问栈顶元素
	 * @return 栈顶元素
	 */
	public T peek();
	
	/**
	 * 出栈
	 * @return 删除元素
	 */
	public T pop();
	
	/**
	 * 压栈
	 * @param element
	 */
	public void push(T element);
	
	public int size();
	
	public boolean isEmpty();
}
