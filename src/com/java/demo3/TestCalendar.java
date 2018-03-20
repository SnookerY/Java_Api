package com.java.demo3;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;


public class TestCalendar {

	/**
	 * ����Calendar���getInstance����
	 * 			������ȡCalendar��Ķ���
	 */
	@Test
	public void testGetInstance(){
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getClass().getName());//java.util.GregorianCalendar
		
		//getTime�������ض�Ӧ��Date����,���Խ�Calendar���󻻻�ΪDate����
		System.out.println(cal.getTime());//Thu Aug 03 17:40:01 CST 2017
	
		//����CregorianCalendar����
		GregorianCalendar c1 = new GregorianCalendar(2017,Calendar.AUGUST,03);
		System.out.println(c1.getTime());//Thu Aug 03 00:00:00 CST 2017
	}
	
	/**
	 * ����set�����������ڷ���
	 */
	@	Test
	public void testSet(){
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2017);
		cal.set(Calendar.MONTH,Calendar.AUGUST);
		cal.set(Calendar.DATE,03);
		System.out.println(cal.getTime());//Thu Aug 03 17:39:45 CST 2017
	}
	
	/**
	 * ����get������ȡ���ڷ���
	 */
	@Test
	public void testGet(){
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2017);
		cal.set(Calendar.MONTH,Calendar.AUGUST);
		cal.set(Calendar.DATE,03);
		
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(dayOfWeek);//5
	}
	
	/**
	 * ���ĳһ��ĸ����·ݵ�����
	 * 		1.ʹ��Calendar���getInstance������ȡ��ǰ����-ʱ��
	 * 		2.�޸ĸ�����-ʱ��Ϊָ���������Ϊ1��
	 * 		3.ʹ��ѭ����ѭ����1��ѭ����12�£���ѭ�������޸ĵ�ǰ����-ʱ�������·�
	 * 		4.ʹ��getActualMaximum�������Ի�ȡ�����·ݵ�����
	 * 		�·���ʼֵ����1������0����Ҫ�ڴ˻����ϼ�1
	 */
	@Test
	public void testGetActualMaximum(){
		int year = 2017;
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.DATE, 1);
		
		for(int month= Calendar.JANUARY; month<=Calendar.DECEMBER; month++){
			cal.set(Calendar.MONTH, month);
			System.out.println(year +"��"+ (month+1)+ "�£�" 
					+ cal.getActualMaximum(Calendar.DATE)+"��");
		}
	}
		
		/**
		 * ���һ����ټ�ȥ3���µ�����
		 */
		@Test
		public void testAdd(){
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.YEAR, 1);//��һ��
			cal.add(Calendar.MONTH, -3);
			
			System.out.println("year:"+cal.get(Calendar.YEAR));
			System.out.println("month:"+(cal.get(Calendar.MONTH)+1));
			System.out.println("day:"+cal.get(Calendar.DAY_OF_MONTH));
		}
	
		/**
		 * Date������Calendar���ڽ��л���
		 * 		1.ʹ��Calendar���getInstance������ȡ��ǰ����-ʱ��
		 * 		2.ʵ����Date�࣬��ȡ��ǰ����-ʱ�����
		 * 		3.ʹ��Calendar��setTime������Date����ת��ΪCalendar����
		 * 		4.ʹ��Calendar��getTime������Calendar����ת��ΪDate����
		 */
		@Test
		public void testSetTimeAndGetTime(){
			Calendar cal = Calendar.getInstance();
			Date date  = new Date();
			cal.setTime(date);//��Dateת��ΪCalendar
			System.out.println(date);
			date = cal.getTime();//��Calendarת��ΪDate
			System.out.println(date);
		}
	
}
