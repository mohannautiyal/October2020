package com.home.threads;

public class Java8Thread {

	
	public static void main(String[] args) {
		Thread th1 = new Thread(()-> {
			for(int i=0;i<10;i++)
				System.out.println("Hello");		
		});
		
		Thread th2 = new Thread(()-> {
			for(int i=0;i<10;i++)
				System.out.println("Welcome");		
		});
		
		th1.start();
		th2.start();
	}
}
