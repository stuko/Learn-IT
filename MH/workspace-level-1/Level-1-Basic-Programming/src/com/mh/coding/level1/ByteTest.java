package com.mh.coding.level1;

public class ByteTest {

	public static void main(String[] args) {
		String s = "ABCDEFG";
		byte[] b = s.getBytes();  // 파라미터 Character Set : 한국어/영어....ISO8859_1 --> UTF-8 or EUC-KR
		// 통신 : Byte[] 로 전송

		String X = new String(b); //  파라미터

	}

}
