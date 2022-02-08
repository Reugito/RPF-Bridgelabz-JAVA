package com.day8.programs;

public class Main {
	
	public static void main(String args[]) {
		
		Points p1 = new Points();
		p1.x = 4;
		p1.y = 3;
		
		Points p2 = new Points();
		p2.x = 6;
		p2.y = 3;
		
		Line line1 = new Line();
		line1.p1 = p1;
		line1.p2 = p2;
		
		System.out.println(line1.getLength());
		Line line2 = new Line();
		line2.p1 = p2;
		line2.p2 = p2;
		
		System.out.println(line2.getLength());
		
		System.out.println("line1 is equal to line2: "+line1.equals(line2));
		
		double check = line1.compareTo(line2);
		
		if(check == 0)
			System.out.println("Line1 is equal to Line2");
		else if(check > 0)
		System.out.println("Line1 is greater than Line2");
		else
			System.out.println("Line1 is less than Line2");
	
	}
}
