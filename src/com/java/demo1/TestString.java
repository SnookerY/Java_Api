package com.java.demo1;


import org.junit.Test;

public class TestString {

	/**
	 * ����String������
	 */
	@Test
	public void testConstantPool(){
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(str1 == str2);
		//true
		
		String str3 = new String("Hello");
		System.out.println(str1 == str3);
		//false
	}
	
	/**
	 * ����String����ĳ���
	 * 
	 * ���ڴ��в���Unicode���룬ÿ���ַ�ռ�������ֽ�
	 * �κ�һ���ַ�(��Ӣ��)����һ���ַ�����
	 */
	@Test
	public void testLength(){
		String str1 = "Hello";
		String str2 = "��ã�String";
		System.out.println(str1.length());
		System.out.println(str2.length());
	}
	
	/**
	 * ��һ���ַ��м�������һ���ַ���
	 * �������Ϊint
	 */
	@Test
	public void testIndexOfString(){
		String str ="I can because i think i can";
		
		int index = str.indexOf("can");
		System.out.println(index);//2
		
		index = str.lastIndexOf("can");
		System.out.println(index);//24
		
		index = str.indexOf("can", 6);
		System.out.println(index);//24
		
		index = str.indexOf("Can");
		System.out.println(index);//-1
	}
	
	/**
	 * ��һ���ַ����н�ȡָ���ַ���
	 * ��ȡ����ΪString
	 */
	@Test
	public void testSubString(){
		String str = "http://www.oracle.com";
		String subStr = str.substring(11, 17);
		System.out.println(subStr);//oracle
		
		subStr = str.substring(7);
		System.out.println(subStr);//www.oracle.com
	}
	
	/**
	 * ȥ���ַ�����ǰ���ͺ�̿��ַ�
	 */
	@Test
	public void testTrim(){
		String userName = "  good man  ";
		System.out.println(userName.length());//12
		
		userName = userName.trim();
		System.out.println(userName.length());//8
		System.out.println(userName);//good man
	}
	
	/**
	 * ����һ���ַ����е��ַ�����
	 */
	@Test
	public void testCharAt(){
		String name = "Whatisjava?";
		for(int i=0;i<name.length();i++){
			char c = name.charAt(i);
			System.out.print(c+" ");//W h a t i s j a v a ? 
		}
	}
	
	/**
	 * ���һ���ַ����Ƿ���ָ���ַ�����ͷ���β
	 */
	@Test
	public void testStartWithAndEndWith(){
		String str = "Thinking in Java";
		System.out.println( str.endsWith("Java"));//true
		System.out.println(str.startsWith("T"));//true
	}
	
	/**
	 * ת���ַ�����Ӣ����ĸ��Сд��ʽ
	 */
	@Test
	public void testToUpperCaseAndToLowerCase(){
		String str = "��ϲ��Java";
		
		str = str.toUpperCase();
		System.out.println(str);//��ϲ��JAVA
		
		str = str.toLowerCase();
		System.out.println(str);//��ϲ��java
	}
	
	/**
	 * ����������ת��Ϊ�ַ�������
	 */
	@Test
	public void testValueOf(){
		double pi = 3.1415926;
		int value = 123;
		boolean flag = true;
		char[] charArr = {'a','b','c','d','e','f','g'};
		
		String str = String.valueOf(pi);
		System.out.println(str);
		
		str = String.valueOf(value);
		System.out.println(str);
		
		str = String.valueOf(flag);
		System.out.println(str);
		
		str = String.valueOf(charArr);
		System.out.println(str);
	}
	
}
