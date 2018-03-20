package com.java.demo5;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

import org.junit.Test;


public class TestFile {
	
	/**
	 * 查看文件的大小
	 * 		File类的length方法获取该文件的大小
	 */
	@Test
	public void testLength(){
		File file = new File(".\\src\\com\\java\\demo5" + File.separator  + "HelloWorld.txt");
		System.out.println(file + "占用字节量：" + file.length());
	}
	
	/**
	 * 创建一个空文件
	 * 		通过File类的exists方法判断文件是否存在，如果不存在，使用
	 * 				File类的createNewFile方法创建该文件
	 * @throws IOException 
	 */
	@Test
	public void testCreateNewFile() throws IOException{
		File file = new File(".\\src\\com\\java\\demo5" + File.separator + "Hello.txt");
		//若不存在，就创建该文件
		if( ! file.exists()){
			file.createNewFile();
		}
	}
	
	/**
	 * 删除一个文件
	 * 		File类的delete方法删除
	 */
	@Test
	public void testDeleteFile(){
		File file = new File(".\\src\\com\\java\\demo5" + File.separator + "Hello.txt");
		file.delete();
	}
	
	/**
	 * 创建一个目录
	 * 		File类的mkdir方法创建目录
	 */
	@Test
	public void testMKDir(){
		File file = new File("myDir");
		file.mkdir();
	}
	
	/**
	 * 创建一个多级目录
	 * 		File类的mkdirs方法创建目录
	 */
	@Test
	public void testMKDirs(){
		File file = new File("a" + File.separator + "b" + File.separator + "c");
		file.mkdirs();
	}
	
	/**
	 * 删除一个目录
	 */
	@Test
	public void testDeleteDir(){
		File file = new File("myDir");
		file.delete();
	}
	
	/**
	 * 输出一个目录中的内容
	 */
	@Test
	public void testListFiles(){
		//"."表示当前目录
		File dir =  new File(".");
		File[] subs = dir.listFiles();
		for(File sub : subs){
			System.out.println(sub);
		}
	}
	
	/**
	 * 输出一个目录中所有扩展名为.txt的文件
	 */
	@Test
	public void testFileFilter(){
		File dir = new File(".");
		/*listFiles方法，该方法参数为FileFilter类型，
		FileFilter是抽象路径名的过滤器，此接口的
		实例可传递给File类的listFiles(FileFilter)方法，
		实现过滤功能*/
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
