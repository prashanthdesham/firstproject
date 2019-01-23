/**
 * 
 */
package com.mathprograms.sample;

import java.util.Scanner;

/**
 * @author PRASHANTH
 *
 */
public class FactorialTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n, fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number");
		n = sc.nextLong();
		int index=1;
		 for(index=1;index<=n;index++) {
			 fact=fact*index;
		 }
		 System.out.println("fact value "+fact);
	}

}
