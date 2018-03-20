package com.java.demo4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import org.junit.Test;

import com.java.demo2.Cell;

public class TestSort {

	/**
	 * Collections.sort排序
	 */
	@Test
	public void testCollectionsSort(){
		List<Integer> list = new ArrayList<Integer>();
		//1作为随机数生成器的种子，保证每次生成的随机数相同
		Random r = new Random(1);
		for(int i = 0; i<10; i++){
			list.add(r.nextInt(100));
		}
		
		System.out.println(list);
		//[85, 88, 47, 13, 54, 4, 34, 6, 78, 48]
		
		Collections.sort(list);
		System.out.println(list);
		//[4, 6, 13, 34, 47, 48, 54, 78, 85, 88]
	}
	
	/**
	 * 使用Comparator接口实现排序
	 */
	@Test
	public void testComparatorSort(){
		List<Cell> cells = new ArrayList<Cell>();
		cells.add(new Cell(2,3));
		cells.add(new Cell(5,1));
		cells.add(new Cell(3,2));
		
		//按照col值的大小排序
		Collections.sort(cells, new Comparator<Cell>() {
			
			@Override
			public int compare(Cell o1,Cell o2) {
				return o1.getCol() - o2.getCol();
			}
		});
		System.out.println(cells);//[5,1, 3,2, 2,3]
	}
}
