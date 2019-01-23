/**
 * 
 */
package com.mathprograms.sample;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author PRASHANTH
 *
 */
public class StandardTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("h:00");
		System.out.println("hour in h format : " + sdf.format(date));
	}

}
