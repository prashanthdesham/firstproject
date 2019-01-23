/**
 * desc:printing All numbers in an Array
 */
package com.prism.bacicpracticeprograms;

/**
 * @author PRASHANTH
 *
 */
public class PrintAllElementsOfArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] Array = { 1, 2, 3, 4, 5 };
		//for(int index=0;index<array.length;index++)
		for(int element : Array) {
			System.out.println(element);
		}
	}

}
