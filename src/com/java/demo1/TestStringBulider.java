package com.java.demo1;

import org.junit.Test;

public class TestStringBulider {
	
	/**
	 * 测试StringBuilder的append方法
	 * StringBuilder类的toString方法可以将对象转换为String类型变量并输出
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
	 * 测试StringBuilder的insert方法
	 */
	@Test
	public void testInsert(){
		StringBuilder str = new StringBuilder("javacppc#objective-c");
		str.insert(9,"php");
		System.out.println(str.toString());
		//javacppc#phpobjective-c
	}
	
	/**
	 * 测试StringBuilder的delete方法
	 */
	@Test
	public void testDelete(){
		StringBuilder str = new StringBuilder("javaoraclecppc#php");
		str = str.delete(4, 10);
		System.out.println(str.toString());
	}
}

