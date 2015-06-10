package com.nonefly.list;
/**
 * 链式线性表（双向链表）
 * 定义链表的基本操作
 * @author nonefly
 * @param <T>
 * 2015-5-1
 */
public class MyLinkList<T> implements MyList<T> {
	// LinkedList<E>
	private Node header;
	private Node tail;
	private int size = 0;

	public MyLinkList() {
		header = null;
		tail = null;
	}

	public int length() {
		return size;
	}

	public T get(int index) {
		if (index < 0 || index > size - 1)
			throw new IndexOutOfBoundsException("index");
		return getNodeByIndex(index).data;
	}

	private Node getNodeByIndex(int index) {
		// 根据index位置 选择从头/尾遍历 提高效率size >> 1 等于 size/2
		if (index < (size >> 1)) {// 从头遍历
			Node node = header;
			for (int i = 0; i < index; i++)
				node = node.next;
			return node;
		} else {// 后半部分，从尾遍历
			Node node = tail;
			for (int i = size - 1; i > index; i--)
				node = node.prev;
			return node;
		}
	}

	public int indexOf(T element) {
		// 这样写看起来代码简单，实则运算复杂度提高，因为每次循环if中会有大量比较判断
		/*
		 * for (Node node = header; node != null; node = node.next) { if
		 * ((node.data == null && element == null)//element为空时 || (element !=
		 * null && element.equals(node.data)))//element不为空时 return index;
		 * index++; } return -1;
		 */
		int index = 0;
		// 所以还是分开写（也是源码中写法）
		if (element == null) {
			for (Node node = header; node != null; node = node.next) {
				if (node.data == null)
					return index;
				index++;
			}
		} else {
			for (Node node = header; node != null; node = node.next) {
				if (element.equals(node.data))
					return index;
				index++;
			}
		}
		return -1;
	}
	//指定位置插入
	public void insert(int index, T element) {
		if (index < 0 || index > size)
			throw new IndexOutOfBoundsException("index");
		if(header == null)
			add(element);
		else
			addBefore(element, getNodeByIndex(index));
	}
	//在节点前添加元素
	private void addBefore(T element, Node n) {
		final Node pre = n.prev;
		final Node newNode = new Node(pre, element, n);//新节点
		if (pre == null)// 无前节点
			header = newNode;
		else
			pre.next = newNode;//前节点next->新节点
		n.prev = newNode;//下一节点prev->新节点
		size++;
	}

	// 尾插法
	public void add(T element) {
		final Node node = tail;
		final Node newNode = new Node(node, element, null);
		if (node == null)// 链表为空
			header = newNode;
		else
			node.next = newNode;
		tail = newNode;
		size++;
	}

	/**
	 * 头插法
	 * @param element
	 */
	public void addHead(T element) {
		final Node node = header;
		final Node newNode = new Node(null, element, node);
		if (node == null)// 链表为空
			tail = newNode;
		else
			node.prev = newNode;
		header = newNode;
		size++;
		
	}

	public T delete(int index) {
		if (index < 0 || index > size - 1)
			throw new IndexOutOfBoundsException("index "+index);
		return unlink(getNodeByIndex(index));
	}
	//删除指定节点
	private T unlink(Node del) {
		final T data = del.data;
		final Node prev = del.prev;
		final Node next = del.next;
		if(prev == null){//删除节点为头结点
			header = next;
		}else{
			prev.next = next;
			del.prev = null;//将删除节点前驱置为空
		}
		if(next == null){//删除节点为尾结点
			tail = prev;
		}else{
			next.prev = prev;
			del.next = null;//将删除节点后继置为空
		}	
		del.data = null;//将删除节点数据置为空
		size--;
		return data;
	}

	public T remove() {
		return unlink(tail);
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void clear() {
		//也许应该从头结点遍历置空所有节点？
		header = null;
		tail = null;
		size = 0;
	}
	@Override
	public String toString() {
		if(size == 0) return "[]";
		StringBuilder sb = new StringBuilder("[");
		for(Node node = header; node != null ; node = node.next)
			sb.append(node.data+", ");
		int len = sb.length();
		return sb.delete(len - 2, len).append("]").toString();
	}
	// 链表节点
	private class Node {
		T data;// 节点数据
		Node next;// 下一个节点
		Node prev;// 前一个节点

		Node() {
		}

		Node(Node prev, T data, Node next) {
			this.prev = prev;
			this.data = data;
			this.next = next;
		}
	}
}
