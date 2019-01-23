/**
 * 
 */
package com.mathprograms.sample;

import java.util.Scanner;

/**
 * @author PRASHANTH
 *
 */
public class ReverseOfString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseOfString rev=new ReverseOfString ();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string : ");
		String  str=sc.nextLine();	
		System.out.println("Reverse of a String  is : "+rev.reverse(str));
		}
	static String reverse(String s)
		{
		String rev="";
		for(int j=s.length();j>0;--j)
		{
		rev=rev+(s.charAt(j-1)); 
		}
		return rev;

	}

}
