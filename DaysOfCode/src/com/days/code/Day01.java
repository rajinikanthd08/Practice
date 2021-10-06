package com.days.code;

import java.util.List;
import java.util.stream.Stream;

public class Day01 {

	//equality against multiple string
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filetype = "jpeg";
		
		if(List.of("png","jpeg","jpg","pdf","xlsx","tiff").contains(filetype)) {
			System.out.println("file type founded "+filetype);
		}
		
		if(Stream.of("png","jpeg","jpg","pdf","xlsx","tiff").anyMatch(filetype :: equalsIgnoreCase)) {
			
			System.out.println("file type founded 2  "+filetype);
		}
		
		
	}

}
