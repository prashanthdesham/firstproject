/**
 * program for try and catch block;
 */
package com.prismit.exceptionhandle;

/**
 * @author PRASHANTH
 *
 */
public class FirstProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a=4,b=0,div;
		try {
		div=a/b;
		System.out.println("print value"+div);
		}catch(ArithmeticException e) {
			System.out.println("zero will never divide with any number");		
		}
		
		
	
	}

}
