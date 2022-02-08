package com.javabasic;
public class Final_keyword {
	
	final String STR = "Constatnt string";
	
	void fun() {
		System.out.println("New function");	
	}
	
	void fun(int a) {             // overloading
		System.out.println("New function");
		
	}
	
	public static void main(String[] args) {
		Final_keyword obj1 = new Final_keyword();
		//obj1.STR = "New val"; // we cannot change final varialble
	    //System.out.println(obj1.STR);

	}
}

class Child extends Final_keyword{
	void fun() {    //overrrided
		System.out.println("overriding New function");	
	}
	
}














// Final keyword
//final class   we cannot inherit that class
//final var  we cannot change the value
// final function  we cannot over write this function