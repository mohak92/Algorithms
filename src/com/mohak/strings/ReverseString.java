package com.mohak.strings;

public class ReverseString {
	
	public String reverseString(String text) {
		StringBuilder sb = new StringBuilder();
		for(int index = text.length() - 1;index >= 0 ;index--) {
			sb.append(text.charAt(index));
		}
		return sb.toString();
	}

}
