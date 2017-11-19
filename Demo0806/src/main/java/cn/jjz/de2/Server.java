package cn.jjz.de2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private static String ip;
	
	public static void main(String[] args) throws IOException {
		
		
		ServerSocket ss=new ServerSocket(6767);
	    
		Socket s=ss.accept();
		ip=s.getInetAddress().toString();
		ip=ip.substring(ip.indexOf("/")+1);
		System.out.println(ip+"服务端");
		
		InputStream in=s.getInputStream();
		OutputStream out=s.getOutputStream();
		
		DataInputStream din=new DataInputStream(in);
		DataOutputStream dout=new DataOutputStream(out);
		
		SendThread it=new SendThread(dout);
		PrintThread ot=new PrintThread(din,ip);
		
		new Thread(ot).start();
		new Thread(it).start();
	}

}
