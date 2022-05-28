package com.mh.coding.level2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FileReadWriter {
	public static void main(String[] args) {
		File f = new File("C:/Private Work/Private Training - Junior/MH/twitter-sample.txt");
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getName());
		System.out.println(f.length());
		System.out.println(f.lastModified());
		
		// Byte : Stream (I/O) , ���ڿ� : Reader/Writer
		try {
			FileInputStream fr = new FileInputStream(f);
			//  Decoration Pattern
			InputStreamReader isr = new InputStreamReader(fr, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			StringBuilder sb = new StringBuilder();
			
//			sb.append("���� ");
//			sb.append("���� ");
//			sb.append("����� ");
//			sb.append("�־��");
//			System.out.println(sb.toString());
			char[] buf = new char[256];
			int read_byte = -1;
			String line = null;
			// while((read_byte = fr.read(buf)) != -1) {
			
			// \n 
			while((line = br.readLine()) != null) {
				sb.append(line).append("\n");
			}
			
			System.out.println(sb.toString());
			fr.close();
//			String line = null;
//			while((read_byte = fis.read(buf)) != -1 ) {
//				System.out.println(new String(buf,"UTF-8"));		
//			}
//			fis.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
}
}
