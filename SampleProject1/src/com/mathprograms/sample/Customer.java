/**
 * 
 */
package com.mathprograms.sample;

/**
 * @author PRASHANTH
 *
 */
public class Customer {

	public static void main(String[]srgs) {
		/*IMathOne car =new BmwImplementation();
		 car.add(10,20);
		 car.sub(20,10);
		 
		ToyotaCar coupe= new ToyotaCar();
		coupe.mul(12, 5);*/
		IMathOverLoad car= new MathFunctionOverLoad();
		System.out.println(car.add("pr","pb"));
		System.out.println(car.add(10,20,30)); 
		System.out.println(car.add(10,20)); 
		
		
		
	}

}
