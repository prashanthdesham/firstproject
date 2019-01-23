package com.mathprograms.sample;

public abstract class AbstarctImplementation {
	public abstract int add(int firstnumber,int secondnumber);
	/**
	 * 
	 * @param firstnumber
	 * @param secondnumber
	 * @return
	 */
	public abstract int sub(int firstnumber,int secondnumber);
	/**
	 * its only specification not implementing
	 */
	/**
	 * 
	 */
	public int mul(int firstnumber,int secondnumber) {
		System.out.println("this is a common functionality");
		return(firstnumber*secondnumber);
	}
	
	
		
	

}
