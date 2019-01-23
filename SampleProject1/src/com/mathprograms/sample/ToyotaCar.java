/**
 * 
 */
package com.mathprograms.sample;

/**
 * @author PRASHANTH
 *
 */
public class ToyotaCar implements IMathOne {
	

	/* (non-Javadoc)
	 * @see com.mathprograms.sample.IMathOne#add(int, int)
	 */
	@Override
	public int add(int firstnumber, int secondnumber) {
		// TODO Auto-generated method stub
		System.out.println("toyota company implements");
		return (firstnumber+secondnumber);
	}

	/* (non-Javadoc)
	 * @see com.mathprograms.sample.IMathOne#sub(int, int)
	 */
	@Override
	public int sub(int firstnumber, int secondnumber) {
		// TODO Auto-generated method stub
		System.out.println("toyota company implements");
		return (firstnumber-secondnumber);
	}
		
		public int mul(int firstnumber,int secondnumber) {
			System.out.println("toyota company implements");
			return(firstnumber*secondnumber);
		}
	}


