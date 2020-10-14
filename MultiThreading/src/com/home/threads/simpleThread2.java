package com.home.threads;


// Creating thread using Runnable interface
public class simpleThread2 implements Runnable {

	int a[]= {1,3,5,7,9};

	@Override
	public void run() {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i] *2);
			
		}
		
	}

}
