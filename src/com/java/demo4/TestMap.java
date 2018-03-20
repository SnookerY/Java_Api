package com.java.demo4;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class TestMap {

	private Map<Emp,String> employees = new HashMap<Emp,String>();
	
	/**
	 * 向Map中添加元素
	 */
	@Before//每执行测试方法前都会执行一次其修饰方法，用户数据初始化
	public void testPut(){
		employees.put(new Emp("张三",25,"男",5000),"张三");
		employees.put(new Emp("李四",21,"女",6000),"李四");
	}
	
	@Test
	public void testGet(){
		Emp zhangsan = new Emp("张三",25,"男",5000);
		String name = employees.get(zhangsan);
		System.out.println(name);
	}
	
	@Test
	public void testContainseKey(){
		Emp zhangsan = new Emp("张三",25,"男",5000);
		boolean has = employees.containsKey(zhangsan);
		System.out.println("是否有员工李四:"+has);
	}
	
}
