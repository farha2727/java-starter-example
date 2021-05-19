package com.qa.java;

public class Taxes {
	
	public static void main(String[] args)

		double salary;

		public static double getNetIncome(int salary) {

			if ((salary > 0) && (salary < 15000)) {
				return salary;
			} else if ((salary > 15000) && (salary < 20000)) {
				return salary - (salary * 10 / 100);
			} else if ((salary > 20000) && (salary < 30000)) {
				return salary - (salary * 15 / 100);
			}
			if ((salary > 30000) && (salary < 45000)) {
				return salary - (salary * 20 / 100);
			} else {
				return salary - (salary * 25 / 100);
			}

		}

		public static double getTax(int salary) {

			if ((salary > 0) && (salary < 15000)) {
				return 0;
			} else if ((salary > 15000) && (salary < 20000)) {
				return salary * 10 / 100;
			} else if ((salary > 20000) && (salary < 30000)) {
				return salary * 15 / 100;
			}
			if ((salary > 30000) && (salary < 45000)) {
				return salary * 20 / 100;
			} else {
				return salary * 25 / 100;
			}

		}


}
