package com.java.demo2;

import java.util.Arrays;

import org.junit.Test;

public class TeseRegEx {

	/**
	 * ����email�Ƿ�Ϸ�
	 * ^��ʼ	$����
	 * [a-zA-Z0-9_\\.-]+@
	 * 		��ʾa-z,A-Z,0-9,�»��ߣ����Լ����ſ��Գ�������һ��Ҳ���Զ�Σ�Ȼ�����@����
	 * 
	 * ([a-zA-Z0-9-]+\\.)+
	 * 		"( )"��ʾ���飬��������ʾ��һ�����ٳ���һ�Σ�Ҳ���Գ��ֶ�Σ�����a-z,A-Z,0-9,�»��ߣ���
	 *
	 * [a-zA-Z0-9]{2,4}
	 * 		��ʾa-z,A-Z,0-9���Գ���2��4�ΰ���
	 */
	@Test
	public void testEmail(){
		String emailRegeX = 
				"^[a-zA-Z0-9_\\.-]+@([a-zA-Z0-9-]+\\.)+[a-zA-Z0-9]{2,4}$";
		String email = "SnookerY@outlook.com";
		System.out.println(email.matches(emailRegeX));
	}
	
	/**
	 * ʹ��split��������ַ���
	 */
	@Test
	public void testSplit(){
		String str = "java cpp php c# objective-c";
		//���ո����ַ���
		String[] strArr = str.split("\\s");
		System.out.println(Arrays.toString(strArr));
		
		String str1 = "100+200-150=150";
		//��+-=����ַ���
		strArr = str1.split("[\\+\\-=]");
		System.out.println(Arrays.toString(strArr));
	}
	
	/**
	 * ʹ��replaceAllʵ���ַ����滻
	 * \\d�κ�һ������	\\D�κ�һ���������ַ�
	 * \\s����ո����ַ�	\\S����ǿո����ַ�
	 * \\w��������ڱ�ʾ�����ַ�  \\W���������ڱ�ʶ�����ַ�
	 */
	@Test
	public void testReplaceAll(){
		String str = "abc123bcd45f6g7890";
		str = str.replaceAll("\\d","����" );
		System.out.println(str);
	}
	
}
