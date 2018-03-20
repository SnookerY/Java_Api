package com.java.demo4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

public class TestQueueAndDeque {

	/**
	 * 测试Queue的用法
	 * 		先进先出FIFO
	 * 		peek()可以查看队列的队首元素
	 * 		poll()可以删除队首元素
	 */
	@Test
	public void testQueue(){
		Queue<String> queue = new LinkedList<String>();
		queue.add("a");
		queue.add("b");
		queue.add("c");
		System.out.println(queue);//[a,b,c]
		
		String str = queue.peek();
		System.out.println(str);//a
		
		while(queue.size()>0){
			str = queue.poll();
			System.out.print(str + " ");//a b c 
		}
	}
	
	/**
	 * 测试Stack（Deque）的用法
	 * 		FILO先进后出可实现栈的数据结构
	 * 		入栈push，出栈pop
	 * 		是Queue的子接口，定义所谓的双端队列，
	 * 		LinkedList是实现了该接口
	 */
	@Test
	public void testDeque(){
		Deque<String> stack = new LinkedList<String>();
		stack.push("a");
		stack.push("b");
		stack.push("c");
		System.out.println(stack);//[c, b, a]
		
		String str = stack.peek();
		System.out.println(str);//c
		
		while(stack.size()>0){
			str = stack.pop();
			System.out.print(str + " ");//c b a
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
