package com.home.threadingissue;

public class Counter implements Runnable{

	 int count =0;
	
	public void run() {
		for(int i=0;i<5;i++)
		{
			count++;
			System.out.println(Thread.currentThread().getName()+ " "+count);
		}
	}
}
