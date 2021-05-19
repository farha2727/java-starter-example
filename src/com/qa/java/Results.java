package com.qa.java;

public class Results {


		
			public static double Physics = 130;
			public static double Chemistry = 100;
			public static double Biology = 112;
			public static double total;
			public static double percentage;
			//public static double passmarkPhy = physics * 100 / 130;
			//public static double passmarkChem = chemistry * 100 / 100;
			//public static double passmarkBio = biology * 100 / 112;

		//Results Revisited

			public static void displayResult() {

				System.out.println("Physics Mark: " + Physics);
				System.out.println("Chemistry Mark: " + Chemistry);
				System.out.println("Biology Mark: " + Biology);
				total = Physics + Chemistry + Biology;
				percentage = total * 100 / 450;
                

				System.out.println("\nOver all Mark: " + total);
				//System.out.println("Over all marks" + total);
				//System.out.println("Percentage  " + percentage);

//			if(percentage < 60) {
//				System.err.println("You have failed");
//			}else {
//				System.err.println("You hava passed");
			//}

			//public static void displayOverallPassMark() {

				//if ((passmarkPhy > 60) && (passmarkChem > 60) && (passmarkBio > 60)) {
					//System.out.println("You pass all exam");
				//} //else {
					//System.out.println("You fail");
				}
			}
	//}


