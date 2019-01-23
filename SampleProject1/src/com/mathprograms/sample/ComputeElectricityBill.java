/**
 * 
 */
package com.mathprograms.sample;

/**
 * @author PRASHANTH
 *
 */
public class ComputeElectricityBill {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int units = 350;

		double billpay = 0;

		if (units < 100) {
			billpay = units * 1.20;
		} else if (units < 300) {
			billpay = 100 * 1.20 + (units - 100) * 2;
		} else if (units > 300) {
			billpay = 100 * 1.20 + 200 * 2 + (units - 300) * 3;
		} 

		System.out.println("Bill to pay : " + billpay);

	}

}
