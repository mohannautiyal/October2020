package com.home.threads;

public class runner {

	
	public static void main(String[] args) {
		simpleThread Th1 = new simpleThread();
		simpleThread2 T2 = new simpleThread2();
        Thread Th2 = new Thread(T2);
        Th2.start();
		Th1.start();
		

	}

	// start
	// sleep
	// stop
}
