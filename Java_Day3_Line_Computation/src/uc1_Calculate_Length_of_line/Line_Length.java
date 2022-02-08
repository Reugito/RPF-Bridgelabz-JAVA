package uc1_Calculate_Length_of_line;
import java.util.*;
public class Line_Length {
	
	public static double Calculet_length() {
		
		double x1, x2, y1, y2;
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter x1 = ");
		x1 = sc.nextInt();
		System.out.print("Enter x2 = ");
		x2 = sc.nextInt();
		System.out.print("Enter y1 = ");
		y1 = sc.nextInt();
		System.out.print("Enter y2 = ");
		y2 = sc.nextInt();
		
		double X = x2 - x1;
		double Y = y2 - y1;
		double z = X*X + Y*Y;
		double Length = Math.sqrt(z);
		//System.out.print(X+ " "+Y+" "+z+" "+Length);
		return Math.floor(Length);
	
	}

	public static void main(String[] args) {
		
		System.out.println("Length of line from given co-ordinates "+Calculet_length());
	}

}
