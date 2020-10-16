package com.home.threadingissue;

public class runner {

	public static void main(String[] args) throws InterruptedException {
		Counter cnt1 = new Counter();
		
		Thread t1 = new Thread(cnt1);
		Thread t2 = new Thread(cnt1);
        
		t1.start();
		t2.start();
		t1.join(); //Makes the main thread to wait for the other threads to complete
		t2.join();
		System.out.println("Threads Completed");
		System.out.println("Threads Completed "+t1.isAlive());
        System.out.println(cnt1.count);
		
	}
}
