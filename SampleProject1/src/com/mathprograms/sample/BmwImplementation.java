/**
 * 
 */
package com.mathprograms.sample;

/**
 * @author PRASHANTH
 *
 */
public class BmwImplementation implements IMathOne {

	/* (non-Javadoc)
	 * @see com.mathprograms.sample.IMathOne#add(int, int)
	 */
	@Override
	public int add(int firstnumber, int secondnumber) {
		// TODO Auto-generated method stub
		System.out.println("BMW inplementation");
		return (firstnumber+secondnumber);
	}

	/* (non-Javadoc)
	 * @see com.mathprograms.sample.IMathOne#sub(int, int)
	 */
	@Override
	public int sub(int firstnumber, int secondnumber) {
		// TODO Auto-generated method stub
		System.out.println("BMW inplementation");
		return (firstnumber-secondnumber);
	}
	
	public int mul(int firstnumber, int secondnumber) {
	System.out.println("BMW inplementation");
	return (firstnumber*secondnumber);
}
}
