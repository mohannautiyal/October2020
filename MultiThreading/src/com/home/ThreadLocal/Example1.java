package com.home.ThreadLocal;

public class Example1 {

	
	public static void main(String[] args) {
		
	
		String surname = "Nautiyal";
		
		ThreadLocal th1 = new ThreadLocal() {
				public Object initialValue() {
				return "Madan";				
			}
			};
			
			
	    System.out.println(th1.get());

		
		th1.set(surname);

		
	    System.out.println(th1.get());
	    th1.remove();
	    System.out.println(th1.get());
	    
		
	}
	
	
}
