package com.mh.coding.level1;

public class CallByValueAndReference {

	public static String receive(String data) {
		data = data + " �޾Ҵ�";
		return data;
	}

	public static String receive(String[] data) {
		data[0] = data[0] + " �޾Ҵ�";
		return data[0];
	}

	
	public static void main(String[] args) {
		
		String X = "���� ";
		String[] A = new String[1];
		A[0] = "���� ";
		String Y  = receive(X);
		
		//System.out.println(X);
		//System.out.println(Y);
		
		Y  = receive(A);
		
		System.out.println(A[0]);
		System.out.println(Y);
		
		// ���� :  Call By Ref (Method ) --> Map / Set / List --> ���۷��� / ��ü
		
	}
	
}