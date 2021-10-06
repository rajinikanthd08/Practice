package com.abstraction;

class Circle implements ShapeInterface{

	double pi = 3.14;
	int radius;
	Circle(int radius, String name){
		
		this.radius=radius;
	}
	@Override
	public void draw() {
		System.out.println("drawing cicle ");
		
	}
	@Override
	public double area() {
		
		return (double)((pi * radius * radius)/2);
	}
	
	
	
}
