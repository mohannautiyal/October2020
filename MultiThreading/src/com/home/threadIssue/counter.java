package com.home.threadIssue;

public class counter implements Runnable {
	
	int c=0;
	
	
	public void incrementCount() {
		for(int i=0;i<5;i++)
		{
			c++;
			System.out.println(Thread.currentThread().getName()+" "+c);

		}
		System.out.println(Thread.currentThread().getName()+" Final Value "+c);
	}


	@Override
	public void run() {
		incrementCount();
		
	}
	
	

}
