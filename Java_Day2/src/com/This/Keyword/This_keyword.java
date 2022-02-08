package com.This.Keyword;
public class This_keyword {
    final String NAME = "parent variable";
	public static void main(String[] args) {
		
		Child childobj = new Child();
		childobj.fun("parent class string ");
		
	}
}

class Child extends This_keyword{
	int var = 2;
	String n = "child";
	void fun( String n) {
		this.n = n;                        // this.n is new variable with same name as n storing value n
		System.out.println(n);
		System.out.println(super.NAME);    // parent variable inheriting
	}

	/*public static void main(String[] args) {
		Child childobj2 = new Child();
		childobj2.fun("child class");
	}*/
	
}
	
