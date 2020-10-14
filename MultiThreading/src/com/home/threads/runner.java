package com.home.threads;

public class runner {

	
	public static void main(String[] args) {
		simpleThread T1 = new simpleThread();
		simpleThread2 T2 = new simpleThread2();
        Thread Th2 = new Thread(T2);
        Th2.start();
		T1.start();
	}
	
	// start
	// sleep
	// stop
}
