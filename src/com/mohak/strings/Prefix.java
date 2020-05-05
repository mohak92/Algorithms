package com.mohak.strings;

import java.util.ArrayList;
import java.util.List;

public class Prefix {

	public List<String> getPrefix(String text){
		
		int lengthOfText = text.length();
		List<String> prefixList = new ArrayList<>();
		
		for(int index = 0;index < lengthOfText + 1;index++) {
			prefixList.add(text.substring(0, index));
		}
		
		return prefixList;
	} 

}
