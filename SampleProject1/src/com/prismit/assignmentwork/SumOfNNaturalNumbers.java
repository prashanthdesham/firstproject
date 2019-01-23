/**
 * 
 */
package com.prismit.assignmentwork;

import java.util.Scanner;

/**
 * @author PRASHANTH
 *
 */
public class SumOfNNaturalNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double sum=0;
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int index=0;index<=num;index++) {
			sum=sum+index;
		}
		System.out.println("Sum of n natural numbers :"+sum);
		
		
		
		
	}

}
