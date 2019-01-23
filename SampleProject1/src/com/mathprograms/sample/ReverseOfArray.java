/**
 * 
 */
package com.mathprograms.sample;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author PRASHANTH
 *
 */
public class ReverseOfArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList arrayList = new ArrayList();
	      arrayList.add("A");
	      arrayList.add("B");
	      arrayList.add("C");
	      arrayList.add("D");
	      arrayList.add("E");
	      System.out.println("Before Reverse Order: " + arrayList);
	      Collections.reverse(arrayList);
	      System.out.println("After Reverse Order: " + arrayList);

	}

}
