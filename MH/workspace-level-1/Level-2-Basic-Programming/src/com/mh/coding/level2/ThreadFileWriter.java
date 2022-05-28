package com.mh.coding.level2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class ThreadFileWriter {
	
	public static void write() {
		File f = new File("C:/Private Work/Private Training - Junior/MH/twitter-sample.txt");
		try {
			FileOutputStream fos = new FileOutputStream(f, true);
			OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
			PrintWriter pw = new PrintWriter(osw);
			if(System.currentTimeMillis()%2 == 0)
				pw.println("2022�� 05�� 21�� 11�� 23�� 08��,  ��ö��, ��������� ���� �ְ� ������ڰ� �ƴմϴ�.");
			else
				pw.println("2022�� 05�� 21�� 11�� 23�� 08��,  ������, ���� ���� ������̶����.");
			pw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		Thread th  = new Thread("Th1") {
			@Override
			public void run() {
				while(true) {
					write();
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		th.start();
		
		
		Thread th2  = new Thread("Th2") {
			@Override
			public void run() {
				while(true) {
					write();
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		th2.start();
		
	}
}