/**
 * 
 */
package com.prismit.myinterface;

import java.util.Scanner;

/**
 * @author PRASHANTH
 *
 */
public class AreaOfEquilateralTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the area of the triangle");
		double a= s.nextDouble();
		double  area=(Math.sqrt(3)/4)*(a*a);
		System.out.print("Area of triangle is  " + area);
		

	}

}
