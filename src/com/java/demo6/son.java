package com.java.demo6;

public class son extends parent{

	private static  int sa=1;
    private static  int sb;
    private   int sc=initc2();
    
    static {
        sb=1;
        System.out.println("2.���ྲ̬����飺��ֵsb�ɹ�");
        System.out.println("2.���ྲ̬����飺sa��ֵ"+sa);
    }
    
    int initc2(){
        System.out.println("5.�����Ա������ֵ--->��sc��ֵ"+sc);
        this.sc=12;
        return sc;
    }
    
    public son(){
        System.out.println("6.���๹�췽ʽ��ʼִ��---> sa:"+sa+",sb:"+sb);
        System.out.println("6.���๹�췽ʽ��ʼִ��---> sc:"+sc);
    }

}
