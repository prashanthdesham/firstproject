/**
 * 
 */
package com.prismit.myabstractclass;

/**
 * @author PRASHANTH
 *
 */ 
public abstract class AbstractMath {
	public abstract int add(int firstnumber,int secondnumber);
	/**
	 * only implements not defining any values
	 */
	public abstract int sub(int firstnumber,int secondnumber);
	/**
	 * only implements not defining any values
	 */
	public int mul(int firstnumber,int secondnumber) {
		System.out.println("implements new all");
		return(firstnumber*secondnumber);
	}
}
