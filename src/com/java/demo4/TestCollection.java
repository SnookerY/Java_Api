package com.java.demo4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Test;

import com.java.demo2.Cell;

public class TestCollection {
	/**
	 * 集合持有对象的引用
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
	 * 使用add方法向集合添加元素
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
	 * 使用contains方法判断集合中是否包含某元素
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
	 * 测试HashSet的size(),clear(),isEmpty()
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
	 * 测试addAll(),containsAll()用法
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
	 * 使用Iterator的hasNext方法，next方法遍历集合
	 */
	@Test
	public void testHasNextAndNext(){
		//LinkedHashSet可以顺序排列
		Collection<String> c = new HashSet<String>();
		c.add("java");
		c.add("cpp");
		c.add("php");
		c.add("c#");
		c.add("objective-c");
		
		Iterator<String> it = c.iterator();
		while(it.hasNext()){
			//next()返回当前指针位置的元素，并将指针后移
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
	 * 使用Iterator的remove方法移除元素
	 * 		删除集合c中包含'c'的字符串元素
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
	 * 使用增强fo循环遍历集合
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

