/**
 * 
 */
package com.prismit.myabstractclass;

/**
 * @author PRASHANTH
 *
 */
public class HundaiCompany extends AbstractMath {

	/**
	 * 
	 */
	public HundaiCompany() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.prismit.myabstractclass.AbstractMath#add(int, int)
	 */
	@Override
	public int add(int firstnumber, int secondnumber) {
		// TODO Auto-generated method stub
		System.out.println("Hundai implements");
		return (firstnumber+secondnumber);
	}

	/* (non-Javadoc)
	 * @see com.prismit.myabstractclass.AbstractMath#sub(int, int)
	 */
	@Override
	public int sub(int firstnumber, int secondnumber) {
		// TODO Auto-generated method stub
		System.out.println("hundai implements");
		return (firstnumber-secondnumber);
	}

}
