package com.java.demo2;

import org.junit.Test;

public class TestCell {

	/**
	 * ����Cell���toString����
	 */
	@Test
	public void testToString(){
		Cell cell = new Cell(6,3);
		System.out.println(cell.toString());//6,3
	}
	
	/**
	 * ����Cell���equals����
	 */
	@Test
	public void testEquals(){
		Cell cell1 = new Cell(6,3);
		Cell cell2 = new Cell(6,3);
		System.out.println(cell1.equals(cell2));//true����дequals������Ϊfalse
		System.out.println(cell1 == cell2);//false
	}
}
