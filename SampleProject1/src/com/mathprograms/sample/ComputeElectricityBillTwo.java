/**
 * 
 */
package com.mathprograms.sample;

import java.util.Scanner;

/**
 * @author PRASHANTH
 *
 */
public class ComputeElectricityBillTwo {

	/**
	 * To generate Electiric city bill for state of Telangana @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        
	   long units;
 
	   Scanner sc=new Scanner(System.in);
 
	   System.out.println("enter number of units");
           units=sc.nextLong();
 
     	   double billpay=0;
 
           if(units<100) {
        	   billpay=units*1.40;
           }else if(units<300) {
        	   billpay=100*1.40+(units-100)*2;
           }else if(units>300) {
        	   billpay=100*1.40+200 *2+(units-300)*3;
           }
 
              System.out.println("Bill to pay :  " + billpay); 

	}

}
