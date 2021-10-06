package com.days.code;

import java.util.List;

public class Day02 {

	//getting the last element of a stream
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = List.of("png","jpeg","jpg","pdf","xlsx","tiff");
			//using reduce
		String lastelemnt = list.stream().reduce((elemnt1, elemnt2)->elemnt2).get();
		System.out.println(lastelemnt);
		
		//using skip
		System.out.println(list.size());
		String lastele = list.stream().skip(list.size()-1).findFirst().get();
		
		System.out.println(lastele);
		
	}

}
