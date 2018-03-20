package com.java.demo5;

import java.io.RandomAccessFile;

import org.junit.Test;

public class TestRandomAccessFile {

	/**
	 * RandomAccessFile��write()
	 * @throws Exception 
	 * ����д�뷽��
	 */
	@Test
	public void testWrite() throws Exception{
		RandomAccessFile raf = new RandomAccessFile(".\\src\\com\\java\\demo5\\raf.dat" ,"rw");
		//д��һ���ֽڣ�д����intֵ�ĵ�8λ
		raf.write(1);
		raf.close();
	}
	
	/**
	 * RandomAccessFile��read()
	 * @throws Exception 
	 * ���Զ�ȡ����
	 */
	@Test
	public void testRead() throws Exception{
		RandomAccessFile raf = new RandomAccessFile(".\\src\\com\\java\\demo5\\raf.dat" , "r");
		//��ȡһ���ֽ�
		int d = raf.read();
		System.out.println(d);
		raf.close();
	}
	
	/**
	 * ����RandomAccessFile��write(byte[])
	 * @throws Exception 
	 * 		����д��
	 */
	@Test
	public void testWriteByteArray() throws Exception {
		RandomAccessFile raf = new RandomAccessFile(".\\src\\com\\java\\demo5\\raf.dat", "rw");
		//���ַ�������Ĭ�ϱ���ת��Ϊ�ֽ�����
		byte[] buf = "HelloWorld".getBytes();
		//���ֽ������������ֽ�һ����д��
		raf.write(buf);
		raf.close();
	}
	
	/**
	 * ����RandomAccessFile��read(byte[])
	 * @throws Exception 
	 * 		������ȡ
	 */
	@Test
	public void testReadByteArray() throws Exception {
		RandomAccessFile raf = new RandomAccessFile(".\\src\\com\\java\\demo5\\raf.dat", "r");
		//��������Ϊ10���ֽ�����
		byte[] buf = new byte[10];
		//���Զ�ȡ10���ֽڴ������飬����ֵΪ��ȡ���ֽ���
		int len = raf.read(buf);
		System.out.println("��ȡ���ˣ�" + len + "���ֽ�");
		System.out.println(new String(buf));
		raf.close();
	}
	
	/**
	 * �����ļ�ָ�����ط���
	 */
	@Test
	public void testPointer() throws Exception{
		RandomAccessFile raf = new RandomAccessFile(".\\src\\com\\java\\demo5\\raf.dat " , "rw");
		//���ָ��λ�ã�Ĭ�ϴ�0��ʼ(�ļ��ĵ�һ���ֽ�λ��)
		System.out.println("ָ��λ�ã�" + raf.getFilePointer());
		
		//��ȡworld����Ҫ��hello5���ֽ�����
		raf.skipBytes(5);
		System.out.println("ָ��λ�ã�" + raf.getFilePointer());
		//��ȡworld��5���ֽ�
		byte[] buf = new byte[5];
		raf.read(buf);
		System.out.println(new String(buf));
		System.out.println("ָ��λ�ã�" + raf.getFilePointer());
		
		//���α��ƶ��ļ���ʼ
		raf.seek(0);
		System.out.println("ָ��λ�ã�" + raf.getFilePointer());
		
		raf.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
