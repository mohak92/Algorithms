package com.mohak.substringSearch;

public class App {

	public static void main(String[] args) {
		
		String text = "My name is john";
		String pattern = "name";
		
		BoyerMoore boyerMoore = new BoyerMoore(text, pattern);
		boyerMoore.preComputeShifts();
		System.out.println(boyerMoore.search());
	}

}
