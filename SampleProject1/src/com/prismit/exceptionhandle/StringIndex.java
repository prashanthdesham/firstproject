/**
 * 
 */
package com.prismit.exceptionhandle;

/**
 * @author PRASHANTH
 *
 */
public class StringIndex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
		//String a="hi my name is prashanth";
		char c=a.charAt(30);
		System.out.println(a);
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("Letter out of range");
		}
	}

}
