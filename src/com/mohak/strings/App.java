package com.mohak.strings;

import java.util.List;

public class App {

	public static void main(String[] args) {
		
		ReverseString reverseString = new ReverseString();
		Prefix prefix = new Prefix();
		Suffix suffix = new Suffix();
		LongestCommonPrefix lcp = new LongestCommonPrefix();
		LongestRepeatedSubstring longestRepeatedSubString = new LongestRepeatedSubstring();
		
		System.out.println(reverseString.reverseString("hello"));
		
		System.out.println();
		
		List<String> prefixList = prefix.getPrefix("Hello"); 
		System.out.println("Prefix");
		for(String s : prefixList) {
			System.out.println(s);
		}
		
		System.out.println();
		
		List<String> suffixList = suffix.getSuffix("Hello"); 
		System.out.println("Suffix");
		for(String s : suffixList) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("Longest Common Prefix: " + lcp.longestCommonPrefix("flower", "flowing"));
		
		System.out.println();
		System.out.println("Longest repeated substring: " 
		+ longestRepeatedSubString.longestRepeatedSubString("helloehelloejdjehello"));
			
	}
}
