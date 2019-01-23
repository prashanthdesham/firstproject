/**
 * 
 */
package com.mathprograms.sample;

import java.util.Calendar;
import java.util.Formatter;

/**
 * @author PRASHANTH
 *
 */
public class DateAndTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formatter fmt = new Formatter();
		Calendar cal = Calendar.getInstance();
		fmt = new Formatter();
		fmt.format("%tc", cal);
		System.out.println(fmt);

	}

}
