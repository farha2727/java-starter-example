package com.qa.java;

public class Runner {
	
	public static void main (String[] args) {
			
		System.out.println("Hello World");
		
		System.out.println(Calculator.add(67, 78));
		
		double slr = Taxes.getNetIncome(600000);
	        System.out.println(slr);
	}
	
	}

