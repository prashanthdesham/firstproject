/**
 * 
 */
package com.prismit.myinterface;

/**
 * @author PRASHANTH
 *
 */
public class TataCompany implements InMath {

	/**
	 * 
	 */
	public TataCompany() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.prismit.sampleproject2.InMath#add(int, int)
	 */
	@Override
	public int add(int firstnumber, int secondnumber) {
		// TODO Auto-generated method stub
		return (firstnumber+secondnumber);
	}

	/* (non-Javadoc)
	 * @see com.prismit.sampleproject2.InMath#sub(int, int)
	 */
	@Override
	public int sub(int firstnumber, int secondnumber) {
		// TODO Auto-generated method stub
		return (firstnumber-secondnumber);
	}
	public int mul(int firstnumber,int secondnumber) {
		System.out.println("Tata company implements");
		return(firstnumber*secondnumber);
	}

}
