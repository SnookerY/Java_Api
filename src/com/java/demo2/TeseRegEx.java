package com.java.demo2;

import java.util.Arrays;

import org.junit.Test;

public class TeseRegEx {

	/**
	 * 测试email是否合法
	 * ^开始	$结束
	 * [a-zA-Z0-9_\\.-]+@
	 * 		表示a-z,A-Z,0-9,下划线，点以及减号可以出现至少一次也可以多次，然后出现@符号
	 * 
	 * ([a-zA-Z0-9-]+\\.)+
	 * 		"( )"表示分组，这段正则表示这一组至少出现一次，也可以出现多次，内容a-z,A-Z,0-9,下划线，点
	 *
	 * [a-zA-Z0-9]{2,4}
	 * 		表示a-z,A-Z,0-9可以出现2到4次包含
	 */
	@Test
	public void testEmail(){
		String emailRegeX = 
				"^[a-zA-Z0-9_\\.-]+@([a-zA-Z0-9-]+\\.)+[a-zA-Z0-9]{2,4}$";
		String email = "SnookerY@outlook.com";
		System.out.println(email.matches(emailRegeX));
	}
	
	/**
	 * 使用split方法拆分字符串
	 */
	@Test
	public void testSplit(){
		String str = "java cpp php c# objective-c";
		//按空格拆分字符串
		String[] strArr = str.split("\\s");
		System.out.println(Arrays.toString(strArr));
		
		String str1 = "100+200-150=150";
		//按+-=拆分字符串
		strArr = str1.split("[\\+\\-=]");
		System.out.println(Arrays.toString(strArr));
	}
	
	/**
	 * 使用replaceAll实现字符串替换
	 * \\d任何一个数字	\\D任何一个非数字字符
	 * \\s代表空格类字符	\\S代表非空格类字符
	 * \\w代表可用于表示符的字符  \\W代表不能用于标识符的字符
	 */
	@Test
	public void testReplaceAll(){
		String str = "abc123bcd45f6g7890";
		str = str.replaceAll("\\d","数字" );
		System.out.println(str);
	}
	
}
