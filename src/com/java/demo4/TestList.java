package com.java.demo4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestList {

	/**
	 * ����List��get������set����
	 */
	@Test
	public void testGetAndSet(){
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("cpp");
		list.add("php");
		list.add("c#");
		list.add("objective-c");
		
		//get��������List
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
		
		//����λ��1��3�ϵ�Ԫ��
		list.set(1, list.set(3,list.get(1)));
		System.out.println(list);//[java, c#, php, c++, objective-c]
	}
	
	/**
	 * ������List�в����ɾ��Ԫ��
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
	 * ����List��subList����
	 * subList��ȡ����list��Դlistռ����ͬ�Ĵ洢�ռ䣬
	 * ����list������Ӱ�쵽Դlist
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
		
		//subList��ȡList��ԴListռ����ͬ�����ݿռ�
		for(int i=0; i<subList.size(); i++){
			subList.set(i, subList.get(i)*10);
		}
		System.out.println(subList);//[30, 40, 50, 60, 70]
		System.out.println(list);//[0, 1, 2, 30, 40, 50, 60, 70, 8, 9]
		
		//������ɾ������Ԫ��
		list.subList(3, 8).clear();
		System.out.println(list);//[0, 1, 2, 8, 9]
	}
	
	/**
	 * ��Listת��Ϊ����toArray()
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
	 * asList()������ת��ΪList 
	 * 		1.�����ַ�������strArr,����Ԫ��Ϊ"a","b","c"
	 * 		2.������strArrת��ΪList���ϱ���list�����������list��
	 * 			Ȼ����list���������Ԫ��"d",���к�鿴������
	 * 		3.��ȡ����list���������͵�����
	 * 		4.��������list1��ʹ��list��addAll����������ת�����ļ�����ӵ�list1��
	 */
	@Test
	public void testArrayToList(){
		String[] strArr = {"a","b","c"};
		
		List<String> list =Arrays.asList(strArr);
		System.out.println(list);//[a, b, c]
		
		//list.add("d");//java.lang.UnsupportedOperationException
		System.out.println(list.getClass().getName());
		/*java.util.Arrays$ArrayListΪArrays����ڲ���ArrayList
		������java.util.ArrayList*/
		
		List<String> list1 = new ArrayList<String>();
		list1.addAll(Arrays.asList(strArr));
		
		list1.add("d");
		System.out.println(list1);//[a, b, c, d]
	}
	
}