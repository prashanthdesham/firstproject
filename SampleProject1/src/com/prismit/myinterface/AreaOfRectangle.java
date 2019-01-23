/**
 * 
 */
package com.prismit.myinterface;

import java.util.Scanner;

/**
 * @author PRASHANTH
 *
 */
public class AreaOfRectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
     System.out.println("Enter length of the rectangle");
     double l= s.nextDouble();
     System.out.println("Enter width of the rectangle");
     double b= s.nextDouble();
     
     double area=(l*b);
     System.out.print("Area Of The Rectangle  " + area);
     
	}

}
