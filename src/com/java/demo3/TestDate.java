package com.java.demo3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;


public class TestDate {

	/**
	 * ����Date���getTime������ȡ���ں�ʱ��
	 */
	@Test
	public void testGetTime(){
		Date date = new Date();
		System.out.println(date);//Thu Aug 03 15:16:47 CST 2017
		
		//1970��1������ʱ��˿̵ĺ�����
		long time = date.getTime();
		System.out.println(time);//1501744607106
	}
	
	/**
	 * ����Date���setTime�����������ں�ʱ��
	 */
	@Test
	public void testSetTime(){
		Date date = new Date();
		System.out.println(date);//Thu Aug 03 15:17:11 CST 2017
		
		long time = date.getTime();
		
		//����һ���������ĺ�����
		time += 60*60*24*1000;
		
		date.setTime(time);
		
		//��������ʱ�˿̵����ں�ʱ��
		System.out.println(date);//Fri Aug 04 15:17:11 CST 2017
	}
	
	/**
	 * ����Date���format������ʽ������
	 * 			format�����ὫDate�����ʽ��Ϊ����-ʱ���ַ���
	 */
	@Test
	public void testFormat(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		String strDate = sdf.format(date);
		System.out.println(strDate);//2017-08-03 15:17:40

	}
	
	/**
	 * ����parse�������ַ���ת��ΪDate����
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
