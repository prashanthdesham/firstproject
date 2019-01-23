/**
 * 
 */
package com.prism.bacicpracticeprograms;

/**
 * @author PRASHANTH
 *
 */
public class SumOfNaturalNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double sum=0;
		for(int index=0;index<=100;index++) {
			sum=sum+index;
			//System.out.print(index+"+");	
		}
		System.out.println("print sum on natutal numbers: "+sum);
	}

}
