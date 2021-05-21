package com.qa.java;

public class Loop {

	
	public static void  Numbers () {
		for(int counter = 10; counter < 100; counter++) {
			
	           // Finding the first digit
	           int first = counter / 10;
	            
	           // Finding the last digit
	           int last = counter % 10;
	            
	           // Finding the sum of the digits
	           int sum = first + last;
	           
	    System.out.println( "The sum of two digits is " + counter + " " + sum);       
	     
//		int firstDigit = counter % 10;
//	    int remainingNumber = counter / 10;
//	    int SecondDigit = remainingNumber % 10;
//	    remainingNumber = remainingNumber / 10;
	//	
//	    int sum = firstDigit + SecondDigit;
	//    
//	    System.out.println( "this is " + counter + " " + sum);  
	           
	}
	}};

