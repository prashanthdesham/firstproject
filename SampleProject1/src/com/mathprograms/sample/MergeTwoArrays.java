/**
 * 
 */
package com.mathprograms.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author PRASHANTH
 *
 */
public class MergeTwoArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[] = { "A", "N", "T" };
		String b[] = { "M", "A","N" };
		List list = new ArrayList(Arrays.asList(a));
		list.addAll(Arrays.asList(b));
		Object[] c = list.toArray();
		System.out.println(Arrays.toString(c));
	}

}
