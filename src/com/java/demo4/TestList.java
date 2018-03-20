package com.java.demo4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestList {

	/**
	 * 测试List的get方法和set方法
	 */
	@Test
	public void testGetAndSet(){
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("cpp");
		list.add("php");
		list.add("c#");
		list.add("objective-c");
		
		//get方法遍历List
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i).toUpperCase());
			/*
			   JAVA
			   CPP
			   PHP
			   C#
			   OBJECTIVE-C
			  */
		}
		
		String value = list.set(1, "c++");
		System.out.println(value);//cpp
		System.out.println(list);//[java, c++, php, c#, objective-c]
		
		//交换位置1和3上的元素
		list.set(1, list.set(3,list.get(1)));
		System.out.println(list);//[java, c#, php, c++, objective-c]
	}
	
	/**
	 * 测试向List中插入和删除元素
	 */
	@Test
	public void testInsertAndRemove(){
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("c#");
		System.out.println(list);//[java, c#]
		
		list.add(1, "cpp");
		System.out.println(list);//[java, cpp, c#]
		
		list.remove(2);
		System.out.println(list);//[java, cpp]
	}
	
	/**
	 * 测试List的subList方法
	 * subList获取的子list与源list占有相同的存储空间，
	 * 对子list操作会影响到源list
	 */
	@Test
	public void testSubList(){
		List<Integer> list = new ArrayList<Integer>();
		/*list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);*/
		for(int i=0; i<10; i++){
			list.add(i);
		}
		System.out.println(list);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		
		List<Integer> subList = list.subList(3, 8);
		System.out.println(subList);//[3, 4, 5, 6, 7]
		
		//subList获取List和源List占有相同的数据空间
		for(int i=0; i<subList.size(); i++){
			subList.set(i, subList.get(i)*10);
		}
		System.out.println(subList);//[30, 40, 50, 60, 70]
		System.out.println(list);//[0, 1, 2, 30, 40, 50, 60, 70, 8, 9]
		
		//可用于删除连续元素
		list.subList(3, 8).clear();
		System.out.println(list);//[0, 1, 2, 8, 9]
	}
	
	/**
	 * 将List转换为数组toArray()
	 */
	@Test
	public void testToArray(){
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		String [] strArr = list.toArray(new String[]{});
		System.out.println(Arrays.toString(strArr));//[a, b, c]

	}
	
	/**
	 * asList()将数组转换为List 
	 * 		1.构建字符串数组strArr,数组元素为"a","b","c"
	 * 		2.将数组strArr转换为List集合变量list，并输出集合list，
	 * 			然后向list集合中添加元素"d",运行后查看输出结果
	 * 		3.获取变量list所属的类型的名称
	 * 		4.构建集合list1，使用list的addAll方法将数组转换来的集合添加到list1中
	 */
	@Test
	public void testArrayToList(){
		String[] strArr = {"a","b","c"};
		
		List<String> list =Arrays.asList(strArr);
		System.out.println(list);//[a, b, c]
		
		//list.add("d");//java.lang.UnsupportedOperationException
		System.out.println(list.getClass().getName());
		/*java.util.Arrays$ArrayList为Arrays类的内部类ArrayList
		而不是java.util.ArrayList*/
		
		List<String> list1 = new ArrayList<String>();
		list1.addAll(Arrays.asList(strArr));
		
		list1.add("d");
		System.out.println(list1);//[a, b, c, d]
	}
	
}