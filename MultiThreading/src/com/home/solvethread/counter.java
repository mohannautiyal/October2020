package com.home.solvethread;

public class counter implements Runnable {
	
	int c=0;
	
	
	public synchronized void incrementCount() {
		for(int i=0;i<5;i++)
		{			
			System.out.println(Thread.currentThread().getName()+" value of c is "+c);
			c++;

		}
		System.out.println(Thread.currentThread().getName()+" Final Value "+c);
	}


	@Override
	public void run() {
		incrementCount();
		
	}
	
	

}
