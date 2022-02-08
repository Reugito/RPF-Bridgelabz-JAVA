package com.bridgelabz.AlgorithmProgramsUtility;

public class AlgorithmUtility {
	
	//---------------------method for insertion sort---------
	public static void insertionSort(String []str, int n){
		for (int i=1 ;i<n; i++)
		{
			String temp = str[i];
 
			int j = i - 1;
			while (j >= 0 && temp.length() < str[j].length())
			{
				str[j+1] = str[j];
				j--;
			}
			str[j+1] = temp;
		}
	}
	
	//---------------------method to print sorted elements---------
	public static <t>void printArray(t[] str, int n ){
	    for (int i=0; i<n; i++)
	        System.out.print(str[i]+" ");
	}
	
	//---------------------method for bubble sort---------
	 public void bubbleSort(Integer arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (arr[j] > arr[j+1])
	                {
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
	    }
	 
	//---------------------method for Anagram Detection ---------
	 public boolean anagramDetection(String str1, String str2) {
		 
		 if(str1.length() != str2.length()) 
			 return false;
		 for(int i = 0; i < str1.length(); i++) {
			 Character chara = str1.charAt(i);
			 if(! str2.contains(chara.toString()))
				 return false;
		 }
		 return true;
	 }
	 
	//---------------------method for prime numbers between 0 to 1000 ---------
	 public void getPrimeNumbers() {
		 int startNum = 0;
		 int lastNum = 1000;
		 for(int i = startNum; i <= lastNum; i++) {
			 int cnt = 0;
			 for(int j = 2; j <= i/2; j++) {
				 if( i % j == 0) {
					 cnt++;
					 break;
				 }
			 }
			 if( cnt == 0 && i !=0 && i != 1) {
				 System.out.println(i);
				 getAnagramAndPalindrome_PrimeNumbers(i);
			 }
		 }
	 }
	 
	//---------------------method for anagram and palindrom numbers ---------
	public void getAnagramAndPalindrome_PrimeNumbers(int number) {
		boolean  palindrom;
		palindrom = getPalindrom(number);
		if(palindrom) {
			System.out.println(number +" is palindrom");
		}
	}
	
	//---------------------method for palindrome number ---------
	public boolean getPalindrom(int number) {
		int temp = number, reverse = 0, digit;
		while( temp != 0) {
			digit = temp % 10;
			reverse = reverse * 10 + digit;
			temp /= 10;
		}
		if(reverse == number)
			return true;
		return false;
	}
	
	//---------------------method for Binary search ---------
	public static boolean binarySearchWord(String[] arr, String word){
        int head = 0, last = arr.length - 1;
        while (head <= last) {
            int mid = head + (last - head) / 2;
            int res = word.compareTo(arr[mid]);
            if (word.contains(arr[mid]))
                return true;
            if (res > 0)
                head = mid + 1;
            else
                last = mid - 1;
        }
        return false;
    }
}
