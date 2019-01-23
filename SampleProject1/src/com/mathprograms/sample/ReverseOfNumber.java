/**
 * 
 */
package com.mathprograms.sample;

import java.util.Scanner;

/**
 * @author PRASHANTH
 *
 */
public class ReverseOfNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,res=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		while(n!=0)
		{
		a=n%10;
		res=(res*10)+a;
		n=n/10;
		}
		System.out.println("reverse of a number is "+res);

	}

}
