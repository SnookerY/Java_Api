package com.java.demo2;

import org.junit.Test;

public class TestNumber {

	/**
	 * ����Number��intValue������doubleValue����
	 */
	@Test
	public void testIntValueAndDoubleValue(){
		Number d = 123.45;
		Number n = 123;
		
		//���d��n������������
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
	 * ����Integer��parseInt����
	 * 		���ַ���"123"ת��Ϊint����
	 * 		�޷��������ַ���ת��Ϊint���ͻ��׳�
	 * 			java.lang.NumberFormatException�쳣
	 */
	@Test
	public void testParseInt(){
		String str = "123";
		int value = Integer.parseInt(str);
		System.out.println(value);//123
	}
	
	/**
	 * ����Double��parseDouble����
	 * 		���ַ���"12345.00"ת��Ϊdouble����
	 * 		�޷��������ַ���ת��Ϊdouble���ͻ��׳�
	 * 			java.lang.NumberFormatException�쳣
	 */
	@Test
	public void testParseDouble(){
		String str ="12345.00";
		double value = Double.parseDouble(str);
		System.out.println(value);//12345.0
	}
	
}
