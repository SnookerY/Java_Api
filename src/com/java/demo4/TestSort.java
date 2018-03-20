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
	 * Collections.sort����
	 */
	@Test
	public void testCollectionsSort(){
		List<Integer> list = new ArrayList<Integer>();
		//1��Ϊ����������������ӣ���֤ÿ�����ɵ��������ͬ
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
	 * ʹ��Comparator�ӿ�ʵ������
	 */
	@Test
	public void testComparatorSort(){
		List<Cell> cells = new ArrayList<Cell>();
		cells.add(new Cell(2,3));
		cells.add(new Cell(5,1));
		cells.add(new Cell(3,2));
		
		//����colֵ�Ĵ�С����
		Collections.sort(cells, new Comparator<Cell>() {
			
			@Override
			public int compare(Cell o1,Cell o2) {
				return o1.getCol() - o2.getCol();
			}
		});
		System.out.println(cells);//[5,1, 3,2, 2,3]
	}
}
