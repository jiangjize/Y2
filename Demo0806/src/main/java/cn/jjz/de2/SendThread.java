package cn.jjz.de2;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class SendThread implements Runnable {

	private DataOutputStream dout;
	public SendThread(DataOutputStream dout){
		super();
		this.dout=dout;
	}
	
	public void run() {
		while(true){
			String msg;
			
			try {
				BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
				msg=bf.readLine();
				dout.writeUTF(msg);
			} catch (IOException e) {
				
				e.printStackTrace();
				break;
			}	
		}	
	}
}
