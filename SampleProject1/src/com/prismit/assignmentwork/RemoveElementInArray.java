/**
 * 
 */

package com.prismit.assignmentwork;
import java.util.Arrays;
/**
 * @author PRASHANTH
 *
 */

public class RemoveElementInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[]test=new int[] {1,2,3,4,5};
		System.out.println("length of array"+Arrays.toString(test));
		test = ArrayUtils.remove(test, 2);
		}
	}


	