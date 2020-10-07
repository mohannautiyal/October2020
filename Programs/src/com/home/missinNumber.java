package com.home;


public class missinNumber {
	
	
	public static void main(String[] args) {
		int a[]= {3,1,2,5,6,7};
		
		int size =a.length;
		int sumOfElements = (size+1) *(size+2)/2;
		int sumactual=0;
		for(int n:a)
			sumactual = sumactual+n;
		
		int MissingNum= sumOfElements -sumactual;
		
		System.out.println(MissingNum);
	}

}
