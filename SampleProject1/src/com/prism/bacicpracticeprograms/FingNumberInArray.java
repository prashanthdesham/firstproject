/**
 * 
 */
package com.prism.bacicpracticeprograms;

/**
 * @author PRASHANTH
 *
 */
public class FingNumberInArray {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int num = 3;
		boolean validation = false ; // NO , WE DO NOT FIND THE NUMBER
		for (int index = 0; index < array.length; index++) {
			if (array[index] == num) {
				validation = true; // yes , I FOUND THE NUMBER AND
				break; // GOING TO HOME
			} 
		}
		if(validation) {
			System.out.println("FOUND");
		}else {
			System.out.println("NOT FOUND");
		}
	}
}

