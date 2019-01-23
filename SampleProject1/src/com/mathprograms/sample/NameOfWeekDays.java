/**
 * 
 */
package com.mathprograms.sample;

import java.text.DateFormatSymbols;

/**
 * @author PRASHANTH
 *
 */
public class NameOfWeekDays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] weekdays = new DateFormatSymbols().getWeekdays();

		for (int i = 2; i < (weekdays.length - 1); i++) {
			String weekday = weekdays[i];
			System.out.println("weekday = " + weekday);

		}

	}
}
