/**
 * desc:program for finding given factorial number
 */
package com.mathprograms.sample;

/**
 * @author PRASHANTH
 *
 */
public class FactorialOfNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 5;
		int fact = 1;
		for (int index = 1; index <= n; index++) {
			fact = fact * index;
		}
		System.out.println(" factorial = " + fact);
	}

}
