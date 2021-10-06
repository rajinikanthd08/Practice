package com.days.code;

public class ReverseString {

	public static void main(String args[]) {
		
		String name = "rajnikanth";
		
		StringBuffer revrs = new StringBuffer();
		
		revrs.append(name);
		
		System.out.println(revrs.reverse());
		char try1[] = name.toCharArray();
	
		
		for(int i =name.length()-1;i>=0;i--) {
		
			System.out.print(try1[i]);
		}
		
	}
	
	
}
