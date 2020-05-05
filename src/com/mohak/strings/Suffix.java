package com.mohak.strings;

import java.util.ArrayList;
import java.util.List;

public class Suffix {
	
	public List<String> getSuffix(String text) {
		
		int lengthOfText = text.length();
		List<String> suffixList = new ArrayList<>();
		
		for(int index = 0;index < lengthOfText;index++) {
			suffixList.add(text.substring(index, lengthOfText));
		}
		
		return suffixList;
	}

}
