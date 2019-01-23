/**
 * writing try  for any Array
 */
package com.prismit.exceptionhandle;

/**
 * @author PRASHANTH
 *
 */
public class Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int array[]= {1,2,3,4,5};
		/**
		 * inserting values in the array
		 */
		try {
		System.out.println("value of array"+array[6]);
		/**
		 * finding the given value in the array 
		 */
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("value not found");
		}
		
	}

}
