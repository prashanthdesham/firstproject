/**
 * 
 */
package com.mathprograms.sample;

/**
 * @author PRASHANTH
 *
 */
public class MultiDimensionalArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][] = { { 1, 2, 3 },
				          { 2, 5, 6 }, 
				          { 4, 6, 8 } };
		double sum = 0.0;
				//array[0][0] + array[1][1] + array[2][2];
		int i=0;
		for(i=0;i<=2;i++) {
			System.out.print("array"+i);
			sum = sum + array[i][i];
		}
		System.out.println("\nSum of array: " + sum);

	}

}
