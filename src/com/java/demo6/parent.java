package com.java.demo6;

public class parent {

	 	private static  int a=1;
	    private static  int b;
	    private   int c=initc();
	    
	    static {
	        b=1;
	        System.out.println("1.���ྲ̬����飺��ֵb�ɹ�");
	        System.out.println("1.���ྲ̬����飺a��ֵ"+a);
	    }
	    
	    int initc(){
	        System.out.println("3.�����Ա������ֵ��---> c��ֵ"+c);
	        this.c=12;
	        System.out.println("3.�����Ա������ֵ��---> c��ֵ"+c);
	        return c;
	    }
	    
	    public parent(){
	        System.out.println("4.���๹�췽ʽ��ʼִ��---> a:"+a+",b:"+b);
	        System.out.println("4.���๹�췽ʽ��ʼִ��---> c:"+c);
	    }

}
