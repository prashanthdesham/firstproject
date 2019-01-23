/**
 * 
 */
package com.mathprograms.sample;

/**
 * @author PRASHANTH
 *
 */
public class MathFunctionOverLoad implements IMathOverLoad {

	/**
	 * 
	 */
	public MathFunctionOverLoad() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.mathprograms.sample.IMathOverLoad#add(int, int)
	 */
	@Override
	public int add(int firstnumber, int secondnumber) {
		// TODO Auto-generated method stub
		return (firstnumber+secondnumber);
	}

	/* (non-Javadoc)
	 * @see com.mathprograms.sample.IMathOverLoad#add(int, int, int)
	 */
	@Override
	public int add(int firstnumber, int secondnumber, int thirdnumber) {
		// TODO Auto-generated method stub
		return (firstnumber+secondnumber+thirdnumber);
	}

	/* (non-Javadoc)
	 * @see com.mathprograms.sample.IMathOverLoad#add(java.lang.String, java.lang.String)
	 */
	@Override
	public String add(String firstname, String secondname) {
		// TODO Auto-generated method stub
		return (firstname+secondname);
	}

}
