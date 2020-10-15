package com.home.threads;


// Creating thread  extending Thread class
// You need to override the run method
public class simpleThread extends Thread {
	
	int a[]= {1,3,5,7,9,10,20,30};
	public void run() {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i] *2);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
