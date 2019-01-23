/**
 * 
 */
package com.prismit.myinterface;

import com.prismit.myabstractclass.AbstractMath;
import com.prismit.myabstractclass.FordCompany;
import com.prismit.myabstractclass.HondaCompany;
import com.prismit.myabstractclass.HundaiCompany;

/**
 * @author PRASHANTH
 *
 */
public class Result {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*HondaCompany res = new HondaCompany();
		res.add(10, 20);
		res.sub(20, 10);
		res.mul(10, 2);*/
		
		AbstractMath ab=new FordCompany();
		//AbstractMath ab=new HondaCompany();		
		//HondaCompany res=new HondaCompany();
		ab.add(10, 20);
		ab.sub(20, 10);
		ab.mul(10, 2);
		
	}

}
