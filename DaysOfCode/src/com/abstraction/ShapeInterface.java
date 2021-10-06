package com.abstraction;

public interface ShapeInterface {


	void draw();
	double area();
	
	@SuppressWarnings("static-access")
	default void moveTo(int x, int y) {
		System.out.println(" has been moved to x=" +x+" y = "+y);
	}
	
}
