package com.java.demo5;

import java.io.RandomAccessFile;

import org.junit.Test;

public class TestRandomAccessFile {

	/**
	 * RandomAccessFile的write()
	 * @throws Exception 
	 * 测试写入方法
	 */
	@Test
	public void testWrite() throws Exception{
		RandomAccessFile raf = new RandomAccessFile(".\\src\\com\\java\\demo5\\raf.dat" ,"rw");
		//写出一个字节，写的是int值的低8位
		raf.write(1);
		raf.close();
	}
	
	/**
	 * RandomAccessFile的read()
	 * @throws Exception 
	 * 测试读取方法
	 */
	@Test
	public void testRead() throws Exception{
		RandomAccessFile raf = new RandomAccessFile(".\\src\\com\\java\\demo5\\raf.dat" , "r");
		//读取一个字节
		int d = raf.read();
		System.out.println(d);
		raf.close();
	}
	
	/**
	 * 测试RandomAccessFile的write(byte[])
	 * @throws Exception 
	 * 		批量写入
	 */
	@Test
	public void testWriteByteArray() throws Exception {
		RandomAccessFile raf = new RandomAccessFile(".\\src\\com\\java\\demo5\\raf.dat", "rw");
		//将字符串按照默认编码转换为字节数组
		byte[] buf = "HelloWorld".getBytes();
		//将字节数组中所有字节一次性写出
		raf.write(buf);
		raf.close();
	}
	
	/**
	 * 测试RandomAccessFile的read(byte[])
	 * @throws Exception 
	 * 		批量读取
	 */
	@Test
	public void testReadByteArray() throws Exception {
		RandomAccessFile raf = new RandomAccessFile(".\\src\\com\\java\\demo5\\raf.dat", "r");
		//创建长度为10的字节数组
		byte[] buf = new byte[10];
		//尝试读取10个字节存入数组，返回值为读取的字节量
		int len = raf.read(buf);
		System.out.println("读取到了：" + len + "个字节");
		System.out.println(new String(buf));
		raf.close();
	}
	
	/**
	 * 测试文件指针的相关方法
	 */
	@Test
	public void testPointer() throws Exception{
		RandomAccessFile raf = new RandomAccessFile(".\\src\\com\\java\\demo5\\raf.dat " , "rw");
		//输出指针位置，默认从0开始(文件的第一个字节位置)
		System.out.println("指针位置：" + raf.getFilePointer());
		
		//读取world，需要将hello5个字节跳过
		raf.skipBytes(5);
		System.out.println("指针位置：" + raf.getFilePointer());
		//读取world这5个字节
		byte[] buf = new byte[5];
		raf.read(buf);
		System.out.println(new String(buf));
		System.out.println("指针位置：" + raf.getFilePointer());
		
		//将游标移动文件开始
		raf.seek(0);
		System.out.println("指针位置：" + raf.getFilePointer());
		
		raf.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
