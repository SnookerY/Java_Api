package com.java.demo4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Test;

import com.java.demo2.Cell;

public class TestCollection {
	/**
	 * ���ϳ��ж��������
	 */
	@Test
	public void testRef(){
	
		Collection<Cell> cells = new ArrayList<Cell>();
		cells.add(new Cell(1,2));
		Cell cell = new Cell(2,3);
		cells.add(cell);
		System.out.println(cell);//(2,3)
		System.out.println(cells);//[(1,2),(2,3)]
		
		cell.drop();
		System.out.println(cell);//(3,3)
		System.out.println(cells);//[(1,2),(3,3)]
	}
	
	/**
	 * ʹ��add�����򼯺����Ԫ��
	 */
	@Test
	public void testAdd(){
		Collection<String> c= new ArrayList<String>();
		System.out.println(c);//[]
		c.add("a");
		c.add("b");
		c.add("c");
		System.out.println(c);//[a, b, c]
	}
	
	/**
	 * ʹ��contains�����жϼ������Ƿ����ĳԪ��
	 */
	@Test
	public void testContains(){
		Collection<Cell> cells = new ArrayList<Cell>();
		cells.add(new Cell(1,2));
		cells.add(new Cell(1,3));
		cells.add(new Cell(2,2));
		cells.add(new Cell(2,3));
		
		Cell cell = new Cell(1,3);
		boolean flag = cells.contains(cell);
		System.out.println(flag);
	}
	
	/**
	 * ����HashSet��size(),clear(),isEmpty()
	 */
	@Test
	public void testSizeAndClearAndEmpty(){
		Collection<String> c = new HashSet<String> ();
		System.out.println(c.isEmpty());//true
		c.add("java");
		c.add("cpp");
		c.add("php");
		c.add("c#");
		c.add("objective-c");
		System.out.println("isEmpty:"+c.isEmpty()+",size:"+c.size());
		//isEmpty:false,size:5
		
		c.clear();
		System.out.println("isEmpty:"+c.isEmpty()+",size:"+c.size());
		//'isEmpty:true,size:0
	}
	
	/**
	 * ����addAll(),containsAll()�÷�
	 */
	@Test
	public void testAddAllAndContainsAll(){
		Collection<String> c1 = new ArrayList<String>();
		c1.add("java");
		c1.add("cpp");
		c1.add("php");
		c1.add("c#");
		c1.add("objective-c");
		System.out.println(c1);//[java, cpp, php, c#, objective-c]
		
		Collection<String> c2 = new HashSet<String>();
		c2.addAll(c1);
		System.out.println(c2);//[cpp, php, c#, java, objective-c]
	
		Collection<String> c3 = new ArrayList<String>();
		c3.add("java");
		c3.add("cpp");
		boolean b = c1.containsAll(c3);
		System.out.println(b);//true
	}
	
	/**
	 * ʹ��Iterator��hasNext������next������������
	 */
	@Test
	public void testHasNextAndNext(){
		//LinkedHashSet����˳������
		Collection<String> c = new HashSet<String>();
		c.add("java");
		c.add("cpp");
		c.add("php");
		c.add("c#");
		c.add("objective-c");
		
		Iterator<String> it = c.iterator();
		while(it.hasNext()){
			//next()���ص�ǰָ��λ�õ�Ԫ�أ�����ָ�����
			String str = it.next();
			System.out.println(str);
	     /*	cpp
				php
				c#
				java
				objective-c
	      	*/

		}
	}
	
	/**
	 * ʹ��Iterator��remove�����Ƴ�Ԫ��
	 * 		ɾ������c�а���'c'���ַ���Ԫ��
	 */
	@Test
	public void testRemove(){
		Collection<String> c = new HashSet<String>();
		c.add("java");
		c.add("cpp");
		c.add("php");
		c.add("c#");
		c.add("objective-c");
		System.out.println(c);//[cpp, php, c#, java, objective-c]
		
		Iterator<String> it = c.iterator();
		while(it.hasNext()){
			String str = it.next();
			if(str.indexOf('c') != -1){
				it.remove();
			}
		}
		System.out.println(c);//[php, java]
	}
	
	/**
	 * ʹ����ǿfoѭ����������
	 */
	@Test
	public void testFor(){
		Collection<String> c = new HashSet<String>();
		c.add("java");
		c.add("cpp");
		c.add("php");
		c.add("c#");
		c.add("objective-c");
		
		for(String str : c){
			System.out.print(str.toUpperCase()+" ");
			//CPP PHP C# JAVA OBJECTIVE-C 
		}
	}
}

