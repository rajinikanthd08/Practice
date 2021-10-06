package com.abstraction;


class Rectangle  extends shape {

	

	
	
	Rectangle(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void draw() {
		System.out.println("drawing rectangle----");
		
	}

	@Override
	public double area() {
		
		return 0.1;//(double)(length * width);
	}
	
}
