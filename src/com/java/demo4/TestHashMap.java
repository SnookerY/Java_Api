package com.java.demo4;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TestHashMap {

	/**
	 * ȡ�ص������pmֵ
	 */
	@Test
	public void test1(){
		String pm25 = "ũչ��=423,����=378,��̨��԰=406,����������=398," +
				"��԰=406,����=366,��ƽ��=248,������=306,����=231,ǰ��=422," +
				"���ֵ�=368,�ų�=268,��ƽ��=423,������=267,����=377,ǰ��=299," +
				"���ֵ�=285,��ˮ��=277,ũչ��=438,����=356,��̨��԰=179,��̳=277," +
				"����������=270,��԰=268,ͨ��=315";
		String[] arr = pm25.split("[,=]");
		
		Map<String,Integer> map = new HashMap<String,Integer>();
			for(int i =0;i<arr.length;i += 2){
				if(!map.containsKey(arr[i])
						|| Integer.parseInt(arr[i+1])>map.get(arr[i])){
					map.put(arr[i],Integer.parseInt(arr[i+1]));
				}
			}
			System.out.println(map);
	}
	
}
