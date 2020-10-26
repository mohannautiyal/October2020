package com.home;

public class runnableInterface {

	public static void main(String[] args) {

		Runnable runner = new Runnable(){
			
			@Override
			public void run() {
				System.out.println("Running runnable ....");
				
			}
		};

		
		Thread t1= new Thread(runner);
		t1.start();
		
	//Using Lamda Expression	
		Runnable lamdaRunnable = ()-> System.out.println("Running lamda runnable");
		
		Thread t2= new Thread(lamdaRunnable);
		t2.start();
	

	// More simplified
		
		Thread Th = new Thread(()->System.out.println("Most simplified runnable using lamda"));
		Th.start();
	}

}


