package com_random_no_generate;
import java.util.*;
public class Random_num {

	public static void main(String[] args) {
		
		Random random = new Random(); 
		int num =  random.nextInt(2);  
		System.out.println("Generated number is "+num);

	}

}
