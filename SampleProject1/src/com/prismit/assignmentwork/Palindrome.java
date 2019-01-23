/**
 * 
 */
package com.prismit.assignmentwork;

/**
 * @author PRASHANTH
 *
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int index,sum=0,temp;
		int num=455;
		//chech the num is palindrome or not
		temp=num;
		while(num>0) {
			index=num%10;
			sum=(sum*10)+index;
			num=num/10;
		}
		if(temp==sum)    
			   System.out.println("palindrome number ");    
			  else    
			   System.out.println("not palindrome");    
		}
	}


