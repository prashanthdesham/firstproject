/**
 * 
 */
package com.mathprograms.sample;

/**
 * @author PRASHANTH
 *
 */
public class SumOfNNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int n = 5;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("The Sum Of " + n + " Numbers are:" + sum);
	}

}
