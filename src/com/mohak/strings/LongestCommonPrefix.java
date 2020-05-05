package com.mohak.strings;

public class LongestCommonPrefix {
	
	public String longestCommonPrefix(String text1, String text2) {
		int commonLength = Math.min(text1.length(), text2.length());
		
		for(int index = 0;index < commonLength;index++) {
			if(text1.charAt(index) != text2.charAt(index)) {
				return text1.substring(0,index);
			}
		}
		return text1.substring(0, commonLength);
	}

}
