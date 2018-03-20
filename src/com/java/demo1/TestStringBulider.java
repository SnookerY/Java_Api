package com.java.demo1;

import org.junit.Test;

public class TestStringBulider {
	
	/**
	 * ����StringBuilder��append����
	 * StringBuilder���toString�������Խ�����ת��ΪString���ͱ��������
	 */
	@Test
	public void testAppend(){
		StringBuilder str = new StringBuilder("Programming Language:");
		str.append("java").append("cpp").append("php")
		.append("c#").append("objective-c");
		System.out.println(str.toString());
		//Programming Language:javacppphpc#objective-c
	}
	
	/**
	 * ����StringBuilder��insert����
	 */
	@Test
	public void testInsert(){
		StringBuilder str = new StringBuilder("javacppc#objective-c");
		str.insert(9,"php");
		System.out.println(str.toString());
		//javacppc#phpobjective-c
	}
	
	/**
	 * ����StringBuilder��delete����
	 */
	@Test
	public void testDelete(){
		StringBuilder str = new StringBuilder("javaoraclecppc#php");
		str = str.delete(4, 10);
		System.out.println(str.toString());
	}
}

