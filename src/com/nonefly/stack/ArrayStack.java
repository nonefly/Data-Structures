package com.nonefly.stack;

import java.util.EmptyStackException;
/**
 * 顺序栈
 * @author nonefly
 * @param <T>
 */
public class ArrayStack<T> implements MyStack<T> {
	private T[] elements;
	private int size = 0;
	private static final int INIT_CAPACITY = 100;
	
	@SuppressWarnings("unchecked")
	public ArrayStack() {
		elements = (T[]) new Object[INIT_CAPACITY];
	}

	@SuppressWarnings("unchecked")
	public ArrayStack(int capacity) {
		elements = (T[]) new Object[capacity];
	}
	
	public T peek() {
		if(size == 0)
			throw new EmptyStackException();
		return elements[size - 1];
	}

	public T pop() {
		T element = peek();
		elements[--size] = null;
		return element;
	}

	public void push(T element) {
		if(size == elements.length)
			resize();
		elements[size++] = element;
	}
	//扩充栈容量
	@SuppressWarnings("unchecked")
	private void resize() {
		assert size == elements.length;
		Object[] a = new Object[size << 1];
		System.arraycopy(elements, 0, a, 0, size);
		elements = (T[]) a;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}
	
	@Override
	public String toString() {
		if(size == 0) return "";
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i++)
			sb.append(elements[i]);
		return sb.toString();
	}
}
