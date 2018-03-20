package com.java.demo2;

import org.junit.Test;

public class TestCell {

	/**
	 * 测试Cell类的toString方法
	 */
	@Test
	public void testToString(){
		Cell cell = new Cell(6,3);
		System.out.println(cell.toString());//6,3
	}
	
	/**
	 * 测试Cell类的equals方法
	 */
	@Test
	public void testEquals(){
		Cell cell1 = new Cell(6,3);
		Cell cell2 = new Cell(6,3);
		System.out.println(cell1.equals(cell2));//true不重写equals方法则为false
		System.out.println(cell1 == cell2);//false
	}
}
