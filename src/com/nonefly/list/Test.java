package com.nonefly.list;

import java.util.Stack;


/**
 * ˳������
 * @author nonefly
 * 
 */
public class Test {
	public static void main(String[] args) {
		MyList<String> list = null;
		
		//list = new MyArrayList<String>();
		list = new MyLinkList<String>();

		//��
		list.add("hello");
		list.add("world");
		list.add("nonefly");
		//��
		System.out.println(list);
		System.out.println("����Ϊ��"+list.length());//����
		list.insert(2, null);//ע����֤Ԫ��null��ȡ
		System.out.println(list);
		System.out.println("����Ϊ��"+list.length());//����
		list.insert(3, "I am");
		System.out.println(list);
		//ɾ
		list.delete(1);
		System.out.println(list);
		//��ѯ
		System.out.println("����Ϊ��"+list.length());//����
		System.out.println("nullԪ������������"+list.indexOf(null));//���1
		System.out.println("'world'Ԫ������������"+list.indexOf("world"));//��ɾ�������-1�����Ǵ���
	}
	
}
