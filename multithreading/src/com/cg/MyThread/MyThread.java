package com.cg.MyThread;

public class MyThread extends Thread {
	public MyThread(String name) {
		super(name);
		
	}
public void run() {
	for(int i=0;i<5;i++) {
		System.out.println(this.getName()+" "+i);
	}
}
}
