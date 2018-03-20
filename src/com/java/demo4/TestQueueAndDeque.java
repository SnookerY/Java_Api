package com.java.demo4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

public class TestQueueAndDeque {

	/**
	 * ����Queue���÷�
	 * 		�Ƚ��ȳ�FIFO
	 * 		peek()���Բ鿴���еĶ���Ԫ��
	 * 		poll()����ɾ������Ԫ��
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
	 * ����Stack��Deque�����÷�
	 * 		FILO�Ƚ������ʵ��ջ�����ݽṹ
	 * 		��ջpush����ջpop
	 * 		��Queue���ӽӿڣ�������ν��˫�˶��У�
	 * 		LinkedList��ʵ���˸ýӿ�
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
