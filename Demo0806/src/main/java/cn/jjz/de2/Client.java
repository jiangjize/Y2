package cn.jjz.de2;

import java.io.DataInputStream;
import java.io.DataOutputStream;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;


public class Client {
	
	private static String ip="localhost";
	
	public static void main(String[] args) throws Exception {
		
		
		Socket s=new Socket(ip,6767);
		OutputStream out=s.getOutputStream();
		InputStream in=s.getInputStream();
		
		DataOutputStream dout=new DataOutputStream(out);
		DataInputStream din=new DataInputStream(in);
		
		SendThread it=new SendThread(dout);
		PrintThread ot=new PrintThread(din,ip);
		
		new Thread(ot).start();
		new Thread(it).start();
	}

}
