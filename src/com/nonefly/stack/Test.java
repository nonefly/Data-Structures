package com.nonefly.stack;

/**
 * 栈测试
 * @author nonefly
 *
 */
public class Test {
	public static void main(String[] args) {
		//MyStack<String> stack = new ArrayStack<String>();
		MyStack<String> stack = new LinkedStack<String>();
		stack.push("hello");
		stack.push("world");
		stack.push("I am");
		stack.push("nonefly");
		//输出hashCode，因为为重写toString，这个也无需重写，事实上栈不允许我们访问除栈顶外的任何元素
		System.out.println(stack);
		System.out.println(stack.size());//4
		//hello, world, I am, nonefly 
		System.out.println("栈顶:" + stack.peek());//输出  nonefly
		//hello, world, I am
		System.out.println("出栈:" + stack.pop());//nonefly出栈
		//hello, world
		System.out.println("出栈:" + stack.pop());//I am出栈
		//hello
		System.out.println("出栈:" + stack.pop());//world出栈
		//hello
		System.out.println("栈顶:" + stack.peek());//输出  hello
		System.out.println(stack.size());//1
	}
}
