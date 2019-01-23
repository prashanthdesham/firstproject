/**
 * 
 */
package com.prism.bacicpracticeprograms;

/**
 * @author PRASHANTH
 *
 */
public class SumOfArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[]array= {1,2,3,4,5};
		double sum=0;
		for(int index=0;index<array.length;index++) {
			sum=sum+array[index];
		}
		System.out.println("sum of array elements "+sum);
	}

}
