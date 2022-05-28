package com.mh.coding.level3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class NetworkTest {

	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(9999);
			System.out.println("Waiting.....");
			Socket socket = ss.accept();
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
			PrintWriter pr = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(),"UTF-8"));
			System.out.println("서버가 받는 내용 : " + br.readLine());
			pr.println("하이....");
			pr.flush();
			br.close();
			pr.close();
			socket.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
