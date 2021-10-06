package com.days.code;

import java.util.Objects;

import java.util.Optional;

public class OptionalException {

	

	
	public static void main(String args[]) {
		
		String fileext = (String) Objects.requireNonNullElse(getfileext(), "get null in 1st");
		
		System.out.println(fileext);
	}
	
	public static Optional<String> getfileextopt( ) {
		return Optional.of(null);
		
	}
	public static String getfileext() {
		return null;
	}
	
	
}
