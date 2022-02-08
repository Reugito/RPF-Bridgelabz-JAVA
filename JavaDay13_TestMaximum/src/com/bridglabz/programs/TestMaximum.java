package com.bridglabz.programs;

public class TestMaximum<t extends Comparable<t>> {
	 t x, y, z;

	public TestMaximum(t x, t y, t z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public static <t extends Comparable<t>>t getMaximumNumber(t num1, t num2, t num3) {
		 t max = num1;
		if(num2.compareTo(max) > 0) 
			max = num2;
		else if(num3.compareTo(max) > 0)
			max = num3;
		
		 return max;
	}
	
	public t  maximum() {
		System.out.println("Maximum number is: "+TestMaximum.getMaximumNumber(x, y, z));
		return TestMaximum.getMaximumNumber(x, y, z);
	}
	
	public static void main(String[] args) {
		Integer a = 10;
		Integer b = 110;
		Integer c = 1;
		new TestMaximum<Integer>(a, b, c).maximum();
		
		String str1 = "hello";
		String str2 = "hello World";
		String str3 = "hello Everyone";
		new TestMaximum<String>(str1, str2, str3).maximum();

	}

}
