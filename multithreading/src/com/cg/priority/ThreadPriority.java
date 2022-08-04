package com.cg.priority;

public class ThreadPriority extends Thread
{
	public void run() {
		System.out.println("rinning thread name is"+Thread.currentThread().getName());
		System.out.println("running thread name is"+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		 ThreadPriority t1=new  ThreadPriority();
		 ThreadPriority t2=new  ThreadPriority();
		 
		 t1.setPriority(Thread.MIN_PRIORITY);
		 t1.start();
		 
		 t2.setPriority(Thread.MAX_PRIORITY);
		 t2.start();
		 System.out.println("thread current priority"+ Thread.currentThread().getPriority());

	}

}
