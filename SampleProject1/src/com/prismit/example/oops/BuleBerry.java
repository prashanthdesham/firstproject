/**
 * 
 */
package com.prismit.example.oops;

/**
 * @author PRASHANTH
 *
 */
public class BuleBerry implements FarmingFruits {

	/* (non-Javadoc)
	 * @see com.prismit.example.oops.FarmingFruits#grow()
	 */
	@Override
	public void grow() {
		System.out.println("blue berry grows up to 1cm");
	}

	/* (non-Javadoc)
	 * @see com.prismit.example.oops.FarmingFruits#harvest()
	 */
	@Override
	public void harvest() {
		System.out.println("its mostly harvest in western countries");
	}

}
