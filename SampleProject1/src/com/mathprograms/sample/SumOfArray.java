/**
 * 
 */
package com.mathprograms.sample;

/**
 * @author PRASHANTH
 *
 */
public class SumOfArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,2,3,4,5};
		double sum = 0;
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[3]);
		for(int i=0; i<array.length;i++) {
			sum= sum+array[i];
			System.out.println("print sum of array: "+sum);
		}

	}

}
