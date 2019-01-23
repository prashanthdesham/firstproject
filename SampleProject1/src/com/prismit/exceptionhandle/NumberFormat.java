/**
 * NumberFormatException
 */
package com.prismit.exceptionhandle;

/**
 * @author PRASHANTH
 *
 */
public class NumberFormat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
		int num=Integer.parseInt("prashanth");
		System.out.println(+num);
		}catch(NumberFormatException e) {
			System.out.println("prashanth is not a number");
		}
	}

}
