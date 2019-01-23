/**
 * 
 */
package com.mathprograms.sample;

/**
 * @author PRASHANTH
 *
 */
public class AverageOfArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 1, 2, 3, 4, 5 };
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		double Average = sum / (array.length);
		System.out.println("print sum of array: " + Average);

	}

}
