package com.bridgebaz.utility;

import java.util.Scanner;

public class Utility {
	Scanner scanner;
	public Utility() {
		scanner = new Scanner(System.in);
	}
	// get integer input
	public int getIntValue() {
		return scanner.nextInt();
	}
	//get characters as input
	public char getCharValue() {
		char alphabate = scanner.next().charAt(0);
		return alphabate;
	}
	// to check leap year
	public void checkLeapYear(int ValueOfYear) {
		int temp = ValueOfYear, noOfDigit=0;
		do {
			noOfDigit++;
			ValueOfYear = ValueOfYear/10;
			
		}while(ValueOfYear != 0);
		
		if(noOfDigit == 4) {
			
			if((temp % 4 == 0) && (temp % 400 == 0 || temp % 100 != 0)) 
				System.out.println(temp+" is a Leap Year");
			else 
				System.out.println(temp+" is not Leap Year");
		}
		else
			System.out.println(temp+" is not valid Year");
	}
	// to check power
	public void getPower( int Number) {
		
		if(Number >=0 && Number<31) {
			int power=0;
			for(int i=0;i<=Number;i++) {
					power = (1<<i);        // 1* 2^
				System.out.println(" 2^"+i+" = "+power);
			}
		}
		else
			System.out.println(" Number is not between o to 31");
	}
	// to check even and odd number
	public void getEvenOdd(int Number) {
		if(Number%2 == 0)
			System.out.println(Number+" is even number");
		else
			System.out.println(Number+" is odd number");
	}
	// to get prime number
	public void getPrimeFactor(int N) {
		int cnt;
		System.out.print("prime factor of "+N+" =");
		for (int i=2;i<=N/2;i++ ){
			   cnt=0;
			if ( N % i == 0 ) {
				   for( int j=2;j<=i/2;j++ ){
					   if( i%j ==0)
						   cnt = 1;
				   }
				   if(cnt == 0) 
					   System.out.print(" "+i);   
			} 
		}
	}
	// method to get harmonic number
	public void getHarmonicNumber(int N) {
		double Harmonicnumber = 0;
		
		for(double i=1; i<=N; i++) {
			Harmonicnumber += 1/i;
		}
		System.out.println("Nth Harmonic Number of "+N+" = "+Harmonicnumber);
	}
	// method to get largest among three number
	public void getLargestNumber(int num1, int num2, int num3) {
		int FirstCond, SecondCond;
		FirstCond = (num1>num2)? num1:num2; 
		SecondCond = (FirstCond>num3)? FirstCond:num3; 
		System.out.println(SecondCond+" is greatest among "+num1+", "+num2+", "+num3);
	}
	// method to get quetient and remainder 
	public void getQuotientRemainder(int Divisor, int Dividend ) {
		int Quotient, Remainder;
		Remainder = Dividend % Divisor;
		Quotient = Dividend / Divisor;
		System.out.println("Remainder = " +Remainder+ " Quotient = " +Quotient);
		
	}
	//Two swap two number
	public void SwapNumber(int num1 ,int num2) {
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("num1 = "+num1+" num2 = "+num2);
	}
	// To check flip coin percentage
	public static void FlipCoinPercent(int noOfFlips) {
		double heads = 0, tails = 0, headpercent;
		
		for(int i=0;i<noOfFlips;i++) {
			double side = Math.random();
			if(side>0.5) {
				
				heads++;
			}
			else {
				tails++;
			}
		}
		headpercent = heads*100/noOfFlips; 
		System.out.println("percentage of heads = "+headpercent);
		System.out.println("percentage of Tails = "+(100-headpercent));
	}
	// To check vowel and consonant
	public void checkAlphabate(char alphabate) {
		boolean vowel ;
		if(alphabate == 'a' || alphabate == 'A')
			vowel  = true;
		else if(alphabate == 'e'|| alphabate == 'E')
			vowel  = true;
		else if(alphabate == 'i'|| alphabate == 'I')
			vowel  = true;
		else if(alphabate == 'o'|| alphabate == 'O')
			vowel  = true;
		else if(alphabate == 'u'|| alphabate == 'U')
			vowel  = true;
		else
			vowel = false;
		
		if (vowel)
			System.out.println(alphabate+" is vowel");
		else
			System.out.println(alphabate+" is Consonent");
	}
	
}
