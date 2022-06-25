package com.mh.coding.level2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class FileWriterTest {
	public static void main(String[] args) {
		File f = new File("C:/Private Work/Private Training - Junior/MH/twitter-sample.txt");
		try {
			
			FileInputStream fr = new FileInputStream(f);
			InputStreamReader isr = new InputStreamReader(fr, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			StringBuilder sb = new StringBuilder();
			String line = null;
			sb.append("2022년 5월 21일 10시 48분 08초,  윤석렬,  나는 문대통령이 아닙니다.").append("\n");
			while((line = br.readLine()) != null) {
				sb.append(line).append("\n");
			}
			
			FileOutputStream fos = new FileOutputStream(f);
			OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
			PrintWriter pw = new PrintWriter(osw);
			pw.println(sb.toString());
			pw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
