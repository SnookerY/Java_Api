package com.java.demo1;


import org.junit.Test;

public class TestString {

	/**
	 * 测试String常量池
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
	 * 测试String对象的长度
	 * 
	 * 在内存中采用Unicode编码，每个字符占用两个字节
	 * 任何一个字符(中英文)都算一个字符长度
	 */
	@Test
	public void testLength(){
		String str1 = "Hello";
		String str2 = "你好，String";
		System.out.println(str1.length());
		System.out.println(str2.length());
	}
	
	/**
	 * 在一个字符中检索另外一个字符串
	 * 检索结果为int
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
	 * 在一个字符串中截取指定字符串
	 * 截取类型为String
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
	 * 去掉字符串的前导和后继空字符
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
	 * 遍历一个字符串中的字符序列
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
	 * 检测一个字符串是否以指定字符串开头或结尾
	 */
	@Test
	public void testStartWithAndEndWith(){
		String str = "Thinking in Java";
		System.out.println( str.endsWith("Java"));//true
		System.out.println(str.startsWith("T"));//true
	}
	
	/**
	 * 转换字符串中英文字母大小写形式
	 */
	@Test
	public void testToUpperCaseAndToLowerCase(){
		String str = "我喜欢Java";
		
		str = str.toUpperCase();
		System.out.println(str);//我喜欢JAVA
		
		str = str.toLowerCase();
		System.out.println(str);//我喜欢java
	}
	
	/**
	 * 将其他类型转换为字符串类型
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
