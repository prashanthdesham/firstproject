/**
 * 
 */
package com.mathprograms.sample;

import java.util.Scanner;

/**
 * @author PRASHANTH
 *
 */
public class Recursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String input= scanner.nextLine();
		String[] token= input.split("");
		String reverse="";
		for(int i=token.length-1; i>=0; i--) {
			//reverse=String.join("",chars[i]);
			//System.out.println("The reverse string is: " +reverse);
			System.out.print(token[i]+"");
		}
		//System.out.println("The reverse string is: " +reverse);
		

	}

}
