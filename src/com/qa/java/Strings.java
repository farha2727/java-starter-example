package com.qa.java;

public class Strings {
	public static java.lang.String str1="yesterday it was raining";
	 public static java.lang.String str2="today is sunny";
	 public static java.lang.String str3;
	 
	//Create two Strings where one string has a value of �yesterday it was raining� and 
	//the other string with a value of �today it is sunny�
//		Concatenate both values, capitalise both strings and print out the result.
//		The result should be: TODAY IT IS SUNNY, YESTERDAY IT WAS RAINING
	 //Now use the substring method to print out: `TODAY IT IS RAINING`
	 
	 public static void concat() {
		 str1=str1.toUpperCase();
		 str2=str2.toUpperCase();
		 System.out.println("\n"+str2 +"," + str1);
		 str3=str2 +"," + str1;
		 System.out.println("\n"+str3.substring(0,8) +" "+ str3.substring(32,39));
	 }
	// For this task you are to implement 4 methods that manipulate String objects. For all parts of this section you are only allowed to use the length(), substring(), and equals() methods. Avoid using arrays or any methods you have yet to be taught as this defeats the purpose of the exercise:
//			
//		 Method 1 - When given a String, count and return how many words there are in that String.
//		 	Method 2 - When given a String, print out this String in a vertical fashion, each word on a different line.
//		 	Method 3 - When given a String, print out this String in a vertical fashion in reverse order, each word on a different line.
//		 	Method 4 - A find method, which takes 2 Strings; the first is message and the second is the String you want to find in the message. A boolean value should be returned to indicate whether or not the second String has been found in the message
	 public static void countWords() {
		 int count1=1;
	   for (int i=0;i<str2.length();i++) {
		   
	     
		    if(str2.charAt(i)=='\s') {
		    	count1++;  
		    	
	            }

	   }
		System.out.println("\n"+ "There are "+ count1 + " words");
		
	 }
	 
	 public static void printVertically(Strings s) {
	     java.lang.String currentWord = "";
	     for (int i = 0; i < s.length(); i++) {
	         Strings currentChar = s.substring(i, i + 1);
	         if (currentChar.equals(" ")) {
	             System.out.println(currentWord);
	             currentWord = "";
	         } else {
	             currentWord += currentChar;
	         }
	     }
	     System.out.println(currentWord);
	 }
	 private Strings substring(int i, int j) {
		 
		// TODO Auto-generated method stub
		return null;
	}
	private int length() {
		 
		// TODO Auto-generated method stub
		return 0;
	}
	public static void finder(Strings message, Strings finder) {
		 
		 	  int lengthOfFinder = finder.length();
		  boolean status = false;
		  for (int i = 0; i < message.length() - lengthOfFinder + 1; i++) {
		    Strings temp = message.substring(i, i+lengthOfFinder);
		    if (temp.equals(finder)) {
		       status = true;
		       break;
		    }   
		  }

		  System.out.println(status);

		} 
	 
	 public static int numOfWords(Strings s) {
	     if (s.length() == 0) return 0;
	     int words = 1;
	     for (int i = 0; i < s.length(); i++) {
	         Strings current = s.substring(i, i + 1);
	         java.lang.String string = " ";
			if (current.equals(string)) {
	             words++;
	         }
	     }
	     return words;
	 } 

	 //Create an array of strings and iterate through it, printing each value to console, 
	 //using an enhanced for loop
	 public static void EnhancedForLoop() {
		  
		 String myStringArray []={"Farha" ," Deeya","Zahra","Maria"};
		 
		 for(String str:myStringArray) {
			 System.out.println(str);
		 }

	 }
	 

	}
//	String str1 = "yesterday it was raining";
//	String str2 = "today it is sunny";
//
//	String mySubString1 = str2.substring(0, 11);
//	String mySubString2 = str1.substring(16, 24);


