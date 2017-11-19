package cn.jjz.de2;

import java.io.DataInputStream;

public class PrintThread implements Runnable {

	private DataInputStream din;
	private String ip;
	public PrintThread(DataInputStream din,String ip){
		super();
		this.din=din;
		this.ip=ip;
	}
	
	public void run() {
		
		while(true){
			try {
				String msg=din.readUTF();
				System.out.println("["+ip+"]"+":"+msg);
			} catch (Exception e) {
				
				break;
			}
		}
	}

}
