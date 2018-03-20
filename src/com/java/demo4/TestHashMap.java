package com.java.demo4;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TestHashMap {

	/**
	 * 取地点中最大pm值
	 */
	@Test
	public void test1(){
		String pm25 = "农展馆=423,东四=378,丰台花园=406,海淀区万柳=398," +
				"官园=406,福州=366,昌平镇=248,怀柔镇=306,定陵=231,前门=422," +
				"永乐店=368,古城=268,昌平镇=423,怀柔镇=267,定陵=377,前门=299," +
				"永乐店=285,秀水街=277,农展馆=438,东四=356,丰台花园=179,天坛=277," +
				"海淀区万柳=270,官园=268,通州=315";
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
