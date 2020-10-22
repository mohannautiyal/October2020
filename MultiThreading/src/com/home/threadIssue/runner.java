package com.home.threadIssue;

public class runner {

	
	
	
	public static void main(String[] args) throws InterruptedException {
		counter cnt1 = new counter();
		Thread t1 = new Thread(cnt1);		
		Thread t2 = new Thread(cnt1);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
	}

}
