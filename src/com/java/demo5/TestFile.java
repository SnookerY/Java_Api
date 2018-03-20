package com.java.demo5;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

import org.junit.Test;


public class TestFile {
	
	/**
	 * �鿴�ļ��Ĵ�С
	 * 		File���length������ȡ���ļ��Ĵ�С
	 */
	@Test
	public void testLength(){
		File file = new File(".\\src\\com\\java\\demo5" + File.separator  + "HelloWorld.txt");
		System.out.println(file + "ռ���ֽ�����" + file.length());
	}
	
	/**
	 * ����һ�����ļ�
	 * 		ͨ��File���exists�����ж��ļ��Ƿ���ڣ���������ڣ�ʹ��
	 * 				File���createNewFile�����������ļ�
	 * @throws IOException 
	 */
	@Test
	public void testCreateNewFile() throws IOException{
		File file = new File(".\\src\\com\\java\\demo5" + File.separator + "Hello.txt");
		//�������ڣ��ʹ������ļ�
		if( ! file.exists()){
			file.createNewFile();
		}
	}
	
	/**
	 * ɾ��һ���ļ�
	 * 		File���delete����ɾ��
	 */
	@Test
	public void testDeleteFile(){
		File file = new File(".\\src\\com\\java\\demo5" + File.separator + "Hello.txt");
		file.delete();
	}
	
	/**
	 * ����һ��Ŀ¼
	 * 		File���mkdir��������Ŀ¼
	 */
	@Test
	public void testMKDir(){
		File file = new File("myDir");
		file.mkdir();
	}
	
	/**
	 * ����һ���༶Ŀ¼
	 * 		File���mkdirs��������Ŀ¼
	 */
	@Test
	public void testMKDirs(){
		File file = new File("a" + File.separator + "b" + File.separator + "c");
		file.mkdirs();
	}
	
	/**
	 * ɾ��һ��Ŀ¼
	 */
	@Test
	public void testDeleteDir(){
		File file = new File("myDir");
		file.delete();
	}
	
	/**
	 * ���һ��Ŀ¼�е�����
	 */
	@Test
	public void testListFiles(){
		//"."��ʾ��ǰĿ¼
		File dir =  new File(".");
		File[] subs = dir.listFiles();
		for(File sub : subs){
			System.out.println(sub);
		}
	}
	
	/**
	 * ���һ��Ŀ¼��������չ��Ϊ.txt���ļ�
	 */
	@Test
	public void testFileFilter(){
		File dir = new File(".");
		/*listFiles�������÷�������ΪFileFilter���ͣ�
		FileFilter�ǳ���·�����Ĺ��������˽ӿڵ�
		ʵ���ɴ��ݸ�File���listFiles(FileFilter)������
		ʵ�ֹ��˹���*/
		File[] subs = dir.listFiles(new FileFilter(){
			@Override
			public boolean accept(File file){
				return file.getName().endsWith(".txt");
			}
		});
		for(File sub : subs){
			System.out.println(sub);
		}
	}
	
}
