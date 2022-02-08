package com.Bridgelabz.Utility;

import java.util.Random;
import java.util.Scanner;

public class Utility {
	Scanner scanner;
	
	public Utility() {
		scanner = new Scanner(System.in);
	}

	public int getIntValue() {
		return scanner.nextInt();
	}
	/* method to getFibonacci series */
	public void getFibonacci(int n) {
		int num1 = 0, num2 = 1;
	    int cnt = 0;
	    while (cnt < n) {
	    	System.out.print(num1 + " ");
	        int num3 = num2 + num1;
	        num1 = num2;
	        num2 = num3;
	        cnt = cnt + 1;
	   }
	}
	/* method to check perfect number or not*/

	public void checkPerfectNum(int n) {
		int sum = 0;
		for(int i=1; i<=n/2; i++) {
			if(n % i == 0) {
				 sum += i;	
			}
		}
		if(n == sum)
			System.out.println(n+" is perfect number");
		else
			System.out.println(n+" is no perfect number");
		
	}
	/* to check number is prime or not */

	public void checkPrimeNum(int n) {
		boolean flag = true;
		if(n != 0 && n != 1) {
			
			for(int i=2; i<=n/2; i++) {
				if(n % i == 0)
					flag = false;
			}
			if(flag)
				System.out.println(n+" is prime number");
			else
				System.out.println(n+" is not prime number");
		}
		else
			System.out.println(n+" is not prime number");
	}
	/* method for reverse number */

	public void getReverseNum(int n) {
		int digit = 0, reverse = 0, temp = n;
		while(temp > 0) {
			digit = temp % 10;
			reverse = reverse*10+digit;
			temp /= 10;
		}
		System.out.println("Reverse of "+n+" = "+reverse);
		
	}
	/* method to get random coupons*/
	
	public static void getCoupons(int noOfcoupns, int sizeOfCoupon) {
		int cnt = 0;
		String str1 = "";
		String coupns = "";
		while(cnt != noOfcoupns) {
			str1 = generateCoupons(sizeOfCoupon);
			if(!coupns.contains(str1)) {
				coupns += str1;
				cnt++;
				System.out.println("coupon"+cnt+" =  "+str1);
			}
		}
		
	}
	/* method to generate random coupons*/
	
	public static String generateCoupons(int sizeOfCoupon) {
		String str = "";
		Random random = new Random();
			for(int i=0; i<sizeOfCoupon; i++) {
				int num = random.nextInt(10);
				str += ""+num;
			}
		return str;
	}
	/* method to get  Elaps time */
	
	public void getElapsTime() {
		int choice=0;
	    double start=0, stop=0;
        do {
            System.out.println("1. Start");
            System.out.println("2. Stop");
            choice = getIntValue();
            switch(choice) {
       			case 1:
       				start = System.currentTimeMillis();
       				System.out.println("You have started the stopwatch please select stop now");
       				break;
       			case 2:
       				stop = System.currentTimeMillis();
       				break; 
            }
       }while(choice != 2);
       double elaps = ((stop - start)/1000)%60;
       System.out.println("Elaps time = "+elaps+" sec");	
	}
	/* method to get rupee note count */
	
	static int i=0, total = 0;
	public static int getRupeeNotesCount(int amount, int[] notes) {
		int remainder = 0;
		if(amount == 0) {
			System.out.println("Invalid amount");
			return 0;
		}
		else {
			if(amount >= notes[i]) {
				int calculateNotes = amount / notes[i];
				remainder = amount % notes[i];
				amount = remainder;
				total += calculateNotes;
				System.out.println(notes[i] + ".Rs notes "+calculateNotes);
				
			}
		}
		i++;
		return getRupeeNotesCount(amount, notes);
	}
	/* method to get date  */
	static int day=0, month=0, year=0;
	public void getDate() {
		
		do {
			System.out.print("Enter the day between 1 to 31 : ");
			day = getIntValue();
			if(day > 31 || day <= 0) {
				System.out.println("Invalid day: "+day);
			}
		}while(day > 31 || day <= 0 );
			
		
		do {
			System.out.print("Enter month from 1 to 12 : ");
			month = getIntValue();
			if(month > 12 || month <= 0)
				System.out.println("Invalid month: "+month);
		}while(month > 12 || month <= 0);
		
		int digits = 0, temp;
		do {
			
			System.out.print("Enter the four digit year : ");
			year = getIntValue();
			if(year > 0) {
				digits = 0;
				temp = year;
				while(temp != 0) {
					digits++;
					temp /= 10;	
				}
			}
			if(digits != 4)
				System.out.println("Invalid year ");
		}while(digits != 4);
	}
	
	/* method to get day of weeks  */
	public static void getDayofWeek() {
		System.out.format("Date: %d/ %d/ %d",day,month,year);
		int y0, d0, m0, x;
		y0 = year - (14 - month) / 12;
		x = y0 + y0/4 - y0/100 + y0/400;
		m0 = month + 12 * ((14 - month) / 12) - 2;
		d0 = (day + x + 31*m0 / 12) % 7;
		System.out.println();
		switch(d0) {
		case 0:
			System.out.println("sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		default:
			System.out.println("Saturday");
		}
	}
	
	// method for temperature conversion

	public static void getTempreture() {
		float Celsius, Fahrenheit;
		int choice=0;
		boolean flag = false;
		System.out.println("1. Tempreture in Celsius ");
        System.out.println("2. Tempreture in  fahrenheit");
        do {
            System.out.print("\nselect the choice to enter the tempreture type: ");
            Utility utility = new Utility();
            choice = utility.getIntValue();
            switch(choice) {
       			case 1:
       				System.out.print("Enter tempreture in Celsius: ");
       				Celsius = utility.getIntValue();
       				Fahrenheit = (Celsius * 9/5) + 32;
       				System.out.println("Tempreture = "+Fahrenheit+" °F");
       				flag = false;
       				break;
       			case 2:
       				System.out.print("Enter tempreture in Fahrenheit: ");
       				Fahrenheit = utility.getIntValue();
       				Celsius = (Fahrenheit - 32) * 5/9;
       				System.out.format("Tempreture = "+Celsius+" °C");
       				flag = false;
       				break;
       			default:
       				flag = true;
       				System.out.print("Invalid selection");
            }
       }while(flag);	
	}

	// get the monthly payment
	public static void getMonthlyPayment(int years, float P, float R) {
		int n = years * 12;     
        float r = R / (12*100);
        float payment = (P*r) / (float)(1-(Math.pow(1+r, -n)));
		System.out.println("Monthly payement  ="+payment);
	}
	
	// method to get square root
	public static void sqrt(int c) {
        double epsilon = 1e-15;
        float t = c;
        while(Math.abs(t-c/t) > epsilon * t) {
            t = (float) ((c/t + t)/2);     
            }
        System.out.println("Square root of " + c + " = " + t);
	}
	
	// method to get binary number
	public static int[] toBinary(int decimal){   
		String result = "";
	     int binary[] = new int[32];    
	     int index = 0;    
	     while(decimal > 0){    
	       binary[index++] = decimal%2;    
	       decimal = decimal/2;    
	     }    
	     for(int i = index-1;i >= 0;i--){    
	       result += ""+binary[i];    
	     }    
	System.out.println((result+2));
	return binary;
	} 

	// method to swap the nibbles of binary number
	public static int swapNibbles(int x)
	{
	    return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
	}
	
	// check if number is power of two;
	public static void isPowerOfTwo(int newNumber) {
		if((newNumber & newNumber-1) ==0)
			System.out.println(newNumber+" is power of 2");
		else 
			System.out.println(newNumber+" is power of 2");
	}
}
