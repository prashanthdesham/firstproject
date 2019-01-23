/**
 * 
 */
package com.prismit.assignmentwork;

/**
 * @author PRASHANTH
 *
 */
public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String st="prasanth is me";
		String sb=new StringBuffer(st).reverse().toString();
		System.out.println("before string: "+st);
	System.out.println("after String buffer: "+sb);
	}

}
