package com.mohak.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestRepeatedSubstring {
	
	public String longestRepeatedSubString(String text) {
		List<String> suffixList = getSuffix(text);
		Collections.sort(suffixList);
		String longestSubstring = "";
		
		for(int i=0;i<text.length()-1;i++){
			String tempString = longestCommonPrefix(suffixList.get(i), suffixList.get(i+1));
			
			if( tempString.length() > longestSubstring.length()){
				longestSubstring = tempString;
			}
		}
		
		return longestSubstring;
	}
	
	public List<String> getSuffix(String text){
		List<String> suffixList = new ArrayList<>();
		
		for(int index = 0; index < text.length(); index++) {
			suffixList.add(text.substring(index, text.length()));
		}
		
		return suffixList;
	}
	
	public String longestCommonPrefix(String text1, String text2) {
		int commonLength = Math.min(text1.length(), text2.length());
		
		for(int index = 0; index < commonLength; index++) {
			if(text1.charAt(index) != text2.charAt(index)) {
				return text1.substring(0, index);
			}
		}
		
		return text1.substring(0, commonLength);
	}

}
