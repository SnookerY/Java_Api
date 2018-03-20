package com.java.demo3;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;


public class TestCalendar {

	/**
	 * 测试Calendar类的getInstance方法
	 * 			用来获取Calendar类的对象
	 */
	@Test
	public void testGetInstance(){
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getClass().getName());//java.util.GregorianCalendar
		
		//getTime方法返回对应的Date对象,可以将Calendar对象换换为Date对象
		System.out.println(cal.getTime());//Thu Aug 03 17:40:01 CST 2017
	
		//创建CregorianCalendar对象
		GregorianCalendar c1 = new GregorianCalendar(2017,Calendar.AUGUST,03);
		System.out.println(c1.getTime());//Thu Aug 03 00:00:00 CST 2017
	}
	
	/**
	 * 调用set方法设置日期分量
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
	 * 调用get方法获取日期分量
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
	 * 输出某一年的各个月份的天数
	 * 		1.使用Calendar类的getInstance方法获取当前日期-时间
	 * 		2.修改该日期-时间为指定年份日期为1日
	 * 		3.使用循环，循环从1月循环到12月，在循环当中修改当前日期-时间对象的月份
	 * 		4.使用getActualMaximum方法可以获取各个月份的天数
	 * 		月份起始值不是1，而是0，需要在此基础上加1
	 */
	@Test
	public void testGetActualMaximum(){
		int year = 2017;
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.DATE, 1);
		
		for(int month= Calendar.JANUARY; month<=Calendar.DECEMBER; month++){
			cal.set(Calendar.MONTH, month);
			System.out.println(year +"年"+ (month+1)+ "月：" 
					+ cal.getActualMaximum(Calendar.DATE)+"天");
		}
	}
		
		/**
		 * 输出一年后再减去3个月的日期
		 */
		@Test
		public void testAdd(){
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.YEAR, 1);//加一年
			cal.add(Calendar.MONTH, -3);
			
			System.out.println("year:"+cal.get(Calendar.YEAR));
			System.out.println("month:"+(cal.get(Calendar.MONTH)+1));
			System.out.println("day:"+cal.get(Calendar.DAY_OF_MONTH));
		}
	
		/**
		 * Date日期与Calendar日期进行互换
		 * 		1.使用Calendar类的getInstance方法获取当前日期-时间
		 * 		2.实例化Date类，获取当前日期-时间对象
		 * 		3.使用Calendar的setTime方法将Date对象转换为Calendar对象
		 * 		4.使用Calendar的getTime方法将Calendar对象转换为Date对象
		 */
		@Test
		public void testSetTimeAndGetTime(){
			Calendar cal = Calendar.getInstance();
			Date date  = new Date();
			cal.setTime(date);//将Date转换为Calendar
			System.out.println(date);
			date = cal.getTime();//将Calendar转换为Date
			System.out.println(date);
		}
	
}
