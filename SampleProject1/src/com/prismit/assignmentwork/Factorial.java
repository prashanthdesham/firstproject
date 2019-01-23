/**
 * 
 */
package com.prismit.assignmentwork;

/**
 * @author PRASHANTH
 *
 */
public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num= 5,fac=1;
		for(int index=1;index<=num;index++) {
			fac=fac*index;
			System.out.println("factorial of :"+fac);
			
		}
	}

}
