/**
 * program for factorial and Even or Add
 */
package com.prismit.example.oops;

/**
 * @author PRASHANTH
 *
 */
public class Prashanth extends MathCoding {

	/**
	 * 
	 */
	public Prashanth() {
		System.out.println("constructor................");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.prismit.example.oops.MathCoding#factorial(int, int)
	 */
	@Override
	public void factorial(int num) {

		double fact = 1;
		/**
		 *we are declaring variable fact as double;
		 */
		try {
			for (int index = 1; index <= num; index++) {
				fact = fact * index;
				System.out.println("factorial " + fact);
			}
		} catch (ArithmeticException e) {
			System.out.println("you need to enter only number");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.prismit.example.oops.MathCoding#printnumber(int)
	 */
	@Override
	public void evenOsrOdd(int num) {
		try {
			if (num % 2 == 0) {
				System.out.println("even number");
			} else {
				System.out.println("odd number");
			}
		} catch (ArithmeticException e) {
			System.out.println("Enter only number");
		}

	}

}
