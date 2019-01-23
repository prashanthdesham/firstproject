/**
 * description: Even or odd using Scanner
 * 
 */
package com.prism.bacicpracticeprograms;

import java.util.Scanner;

/**
 * @author PRASHANTH
 *
 */
public class EvenOrOddTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		if(num%2==0) {
			System.out.println("even number");
			
		}else {
			System.out.println("odd number");
		}
		

	}

}
