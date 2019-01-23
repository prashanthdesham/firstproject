/**
 * 
 */
package com.mathprograms.sample;

import java.util.Scanner;

/**
 * @author PRASHANTH
 *
 */
public class SumOfNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
        int s=0,a[];
        Scanner sc=new Scanner(System.in);
System.out.println("Enter how many numbers you want sum");	   
         n=sc.nextInt();
        a=new int[n];
System.out.println("enter the "+n+" numbers ");
           for(int i=0;i<n;i++)
           {      
       System.out.println("enter  number  "+(i+1)+":");
                  a[i]=sc.nextInt();
            }
s= SumOfNumbers .sumofnum(a,n-1,s);	    
          System.out.println("sum is ="+s);          
    	}
static int sumofnum(int a[],int n,int s1)
{
    if(n<0)
   return s1;
   else
   {
     s1+=a[n];
    
return  SumOfNumbers .sumofnum(a,n-1,s1);
  }
	}

}
