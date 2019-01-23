/**
 * program for Even or Odd and Factorial
 */
package com.prismit.example.oops;

/**
 * @author PRASHANTH
 *
 */
public class Rajesh extends MathCoding {

	/**
	 * 
	 */
	public Rajesh() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.prismit.example.oops.MathCoding#factorial(int)
	 */
	@Override
	public void factorial(int num) {
		double fact = 1;
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
	 * @see com.prismit.example.oops.MathCoding#evenorodd(int)
	 */
	@Override
	public void evenorodd(int num) {
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
