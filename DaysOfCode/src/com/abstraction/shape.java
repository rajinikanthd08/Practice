package com.abstraction;
//draw and area
 public abstract class shape {
	
	 
	 String Objectname="";
	 shape(String name){
		 this.Objectname=name;
	 }
	 
	 public void moveTo(int x, int y) {
		 System.out.println(this.Objectname+ " has been moved to x=" +x+" y = "+y);
	 }
	 
	abstract public void draw();
	abstract public double area();


}