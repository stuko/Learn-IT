package com.mh.coding.level1;

public class ByteTest {
	
	public static void main(String[] args) {
		String s = "ABCDEFG";
		byte[] b = s.getBytes();  // �Ķ���� Character Set : �ѱ���/����....ISO8859_1 --> UTF-8 or EUC-KR
		// ��� : Byte[] �� ����
		
		String X = new String(b); //  �Ķ����
		
	}

}