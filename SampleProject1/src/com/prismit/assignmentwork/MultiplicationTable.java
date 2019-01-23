/**
 * Multiplication table
 */
package com.prismit.assignmentwork;

import java.util.Scanner;

/**
 * @author PRASHANTH
 *
 */
public class MultiplicationTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num ;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter number");
		 num = sc.nextInt();

		for (int index=1; index <= 10; index++) {
			if (index % 2== 0) {
				System.out.println(num + "*" + index + "=" + (num * index));
			} 
		}
		System.out.println("*********************************s");
		for (int index=1; index <= 10; index++) {
			if (index % 2!= 0) {
				System.out.println(num + "*" + index + "=" + (num * index));
			} 
		}
	}
}
