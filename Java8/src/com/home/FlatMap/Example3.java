package com.home.FlatMap;

import java.util.Arrays;

public class Example3 {

	public static void main(String[] args) {
		
		String [][] alphabets = new String[][]{{"A","B"},{"C","D"},{"E","F"}};

        Arrays.stream(alphabets).flatMap(m->Arrays.stream(m)).forEach(x->System.out.println(x));
	}
}
