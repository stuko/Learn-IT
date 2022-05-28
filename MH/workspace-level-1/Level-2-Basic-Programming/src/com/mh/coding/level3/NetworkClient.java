package com.mh.coding.level3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class NetworkClient {
	
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("127.0.0.1", 9999);
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
			PrintWriter pr = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(),"UTF-8"));
			pr.println("hi~~~~~~~~~~");
			pr.flush();
			System.out.println("클라이언트가 받는 내용 : " + br.readLine());
		}catch(Exception e) {
			e.printStackTrace();
		}

		
	}
}
