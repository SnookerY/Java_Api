package com.java.demo3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;


public class TestDate {

	/**
	 * 测试Date类的getTime方法获取日期和时间
	 */
	@Test
	public void testGetTime(){
		Date date = new Date();
		System.out.println(date);//Thu Aug 03 15:16:47 CST 2017
		
		//1970年1月日零时距此刻的毫秒数
		long time = date.getTime();
		System.out.println(time);//1501744607106
	}
	
	/**
	 * 测试Date类的setTime方法设置日期和时间
	 */
	@Test
	public void testSetTime(){
		Date date = new Date();
		System.out.println(date);//Thu Aug 03 15:17:11 CST 2017
		
		long time = date.getTime();
		
		//增加一天所经历的毫秒数
		time += 60*60*24*1000;
		
		date.setTime(time);
		
		//输出明天此时此刻的日期和时间
		System.out.println(date);//Fri Aug 04 15:17:11 CST 2017
	}
	
	/**
	 * 测试Date类的format方法格式化日期
	 * 			format方法会将Date对象格式化为日期-时间字符串
	 */
	@Test
	public void testFormat(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		String strDate = sdf.format(date);
		System.out.println(strDate);//2017-08-03 15:17:40

	}
	
	/**
	 * 测试parse方法将字符串转换为Date对象
	 * @throws ParseException 
	 */
	@Test
	public void testParse() throws ParseException{
		String strDate ="2017-08-03 15:17:40";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date date = sdf.parse(strDate);
		System.out.println(date);
	}
	
}
