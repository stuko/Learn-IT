package com.mh.coding.level1;

public class CallByValueAndReference {

	public static String receive(String data) {
		data = data + " 받았다";
		return data;
	}

	public static String receive(String[] data) {
		data[0] = data[0] + " 받았다";
		return data[0];
	}


	public static void main(String[] args) {

		String X = "나는 ";
		String[] A = new String[1];
		A[0] = "나는 ";
		String Y  = receive(X);

		//System.out.println(X);
		//System.out.println(Y);

		Y  = receive(A);

		System.out.println(A[0]);
		System.out.println(Y);

		// 권유 :  Call By Ref (Method ) --> Map / Set / List --> 레퍼런스 / 객체

	}

}
