/**
 * 
 */
package com.prismit.myinterface;

import java.util.Scanner;

/**
 * @author PRASHANTH
 *
 */
public class AreaOfTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      
      System.out.println("Enter the width of the triangle");
      
     
      double b= s.nextDouble();
      
      System.out.println("Enter the height of the triangle ");
      double h=s.nextDouble();
      
      double area= (b*h)/2;
      System.out.println("Area of traingle" + area);
     
      
      
      
      
      
      }
	

}
