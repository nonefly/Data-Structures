package com.nonefly.stack;

import java.util.EmptyStackException;

public class LinkedStack<T> implements MyStack<T> {
	private Node<T> head = new Node<T> ();//虚构节点
	private int size = 0;
	
	public T peek() {
		if(size == 0)
			throw new EmptyStackException();
		//bottom -> top -> head
		return head.prev.element;//top
	}

	public T pop() {
		T element = peek();
		head.prev = head.prev.prev;
		head.prev.prev.next = head;
		--size;
		return element;
	}
	
	public void push(T element) {
		//Node newNode = new Node<T>(element, head.prev, head); 
		//head.prev.next = newNode;
		//head.prev = newNode;
		
		//链式赋值由右向左，因此下面顺序head.prev = head.prev.next不能改变，
		//否则先改变head.prev，head.prev.next就获取不到正确的值,等同上述操作
		head.prev = head.prev.next = new Node<T>(element, head.prev, head); 
		++size;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}
	
	private static class Node<T>{
		T element;
		Node<T> prev;
		Node<T> next;
		
		Node(){
			this.next = this.prev = this;
		}
		
		Node(T element, Node<T> prev, Node<T> next){
			this.element = element;
			this.prev = prev;
			this.next = next;
		}
	}
}
