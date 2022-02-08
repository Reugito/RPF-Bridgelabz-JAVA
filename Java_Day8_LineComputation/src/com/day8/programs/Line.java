package com.day8.programs;
import java.util.Objects;
public class Line implements CompareToInterface {
Points p1, p2;
	@Override
	public int hashCode() {
		return Objects.hash(p1, p2);
	}

	@Override
	public boolean equals(Object obj) {
		return this.getLength() == ((Line)obj).getLength();
	
	}
	public double getLength() {
		return Math.sqrt(((p2.x-p1.x)*(p2.x-p1.x))+((p2.y-p1.y)*(p2.y-p1.y)));
	}
	
	@Override
	public double compareTo(Object obj) {
		if(this.getLength() == ((Line)obj).getLength()) 
			return 0;
		else if(this.getLength() > ((Line)obj).getLength()) 
			return this.getLength() - ((Line)obj).getLength();
		return 0;
	}

	
	

}
