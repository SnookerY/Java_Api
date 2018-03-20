package com.java.demo2;

import org.junit.Test;

public class TestNumber {

	/**
	 * 测试Number的intValue方法和doubleValue方法
	 */
	@Test
	public void testIntValueAndDoubleValue(){
		Number d = 123.45;
		Number n = 123;
		
		//输出d和n对象所属类型
		System.out.println(d.getClass());//class java.lang.Double
		System.out.println(n.getClass());//class java.lang.Integer
		
		int intValue = d.intValue();
		double doubleValue = d.doubleValue();
		System.out.println(intValue+","+doubleValue);//123,123.45
		
		intValue = n.intValue();
		doubleValue = n.doubleValue();
		System.out.println(intValue+","+doubleValue);//123,123.0
	}
	
	/**
	 * 测试Integer的parseInt方法
	 * 		将字符串"123"转换为int类型
	 * 		无法将汉字字符串转换为int类型会抛出
	 * 			java.lang.NumberFormatException异常
	 */
	@Test
	public void testParseInt(){
		String str = "123";
		int value = Integer.parseInt(str);
		System.out.println(value);//123
	}
	
	/**
	 * 测试Double的parseDouble方法
	 * 		将字符串"12345.00"转换为double类型
	 * 		无法将汉字字符串转换为double类型会抛出
	 * 			java.lang.NumberFormatException异常
	 */
	@Test
	public void testParseDouble(){
		String str ="12345.00";
		double value = Double.parseDouble(str);
		System.out.println(value);//12345.0
	}
	
}
