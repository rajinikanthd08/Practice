package com.abstraction;

public class mainClass {

	// git key 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
	
	public static void main(String[] args) {
		//-----------------------abstraction an interface
shape rect = new Rectangle("rectagn");
rect.draw();
System.out.println("area  "+rect.area());

ShapeInterface circ = new Circle(4,"circle");
		circ.draw();
		System.out.println("area of circl---"+circ.area());
		
rect.moveTo(5, 6);
//------------------------singleton example---------------

Singleton x = Singleton.getInstance();
Singleton y = Singleton.getInstance();
Singleton z = Singleton.getInstance();

System.out.println(x.hashCode());
System.out.println(y.hashCode());
System.out.println(z.hashCode());

if(x==y && y==z) {
	System.out.println("same");
}else {
	System.out.println("not same");
}

System.out.println((x.s).toLowerCase());

// ---------------------------------last four digit display------------------
String a = "1234567890345";
String mask = a.replaceAll("\\w(?=\\w{4})", "*");

System.out.println("account number ----  "+mask);

	}

}
