/**
 * 
 */
package com.prismit.example.oops;

/**
 * @author PRASHANTH
 *
 */
public class Orange implements FarmingFruits {

	/* (non-Javadoc)
	 * @see com.prismit.example.oops.FarmingFruits#grow()
	 */
	@Override
	public void grow() {
		System.out.println("orange grows up to 4 cm");
	}

	/* (non-Javadoc)
	 * @see com.prismit.example.oops.FarmingFruits#harvest()
	 */
	@Override
	public void harvest() {
		System.out.println("orange are harvest in many places");
	}

}
