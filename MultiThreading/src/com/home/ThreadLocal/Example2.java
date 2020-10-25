package com.home.ThreadLocal;

public class Example2 {
	
	public static void main(String[] args) throws InterruptedException {
		CustomerThread th1 = new CustomerThread();
		CustomerThread th2 = new CustomerThread();
		CustomerThread th3 = new CustomerThread();
		CustomerThread th4 = new CustomerThread();
		CustomerThread th5 = new CustomerThread();
		CustomerThread th6 = new CustomerThread();
		
		th1.start();
	
		th2.start();
		

		th3.start();
		th4.start();
		th5.start();
		th6.start();
		
		
	}
	

}

// Problem caused by multiple threads accessing the same variable custid

class CustomerThread extends Thread{
	
	
	static int custid;
	
	
	public void run() {
		custid ++;
		System.out.println(Thread.currentThread().getName()+"  "+custid);
	}
	
	
}