package com.home;

import java.util.HashMap;
import java.util.HashSet;

public class CompareHashMaps {

	public static void main(String[] args) {
		
		
		HashMap<Integer,String> Map1 = new HashMap<Integer,String>();
		Map1.put(1, "A");
		Map1.put(2, "B");
		Map1.put(3, "C");
		Map1.put(4, "D");

		HashMap<Integer,String> Map2 = new HashMap<Integer,String>();
		Map2.put(4, "D");
		Map2.put(1, "A");
		Map2.put(2, "B");
		Map2.put(3, "C");
		
		
		HashMap<Integer,String> Map3 = new HashMap<Integer,String>();
		Map3.put(1, "A");
		Map3.put(2, "B");
		Map3.put(3, "C");
		
		//Comparing using Equals method
		System.out.println(Map1.equals(Map2));
		System.out.println(Map1.equals(Map3));

		//Comparing using keyset
		System.out.println(Map1.keySet().equals(Map2.keySet()));
		
		//Find extra elements
		HashSet<Integer> combineKeys = new HashSet<Integer>(Map1.keySet());
		combineKeys.addAll(Map3.keySet());
		
		combineKeys.removeAll(Map3.keySet());
		System.out.println(combineKeys);
		
		
		
	}
}
