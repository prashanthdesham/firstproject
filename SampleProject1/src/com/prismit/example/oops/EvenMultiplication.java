/**
 * 
 */
package com.prismit.example.oops;

import java.util.Scanner;

/**
 * @author PRASHANTH
 *
 */
public class EvenMultiplication extends TableMultiplication {

	/**
	 * 
	 */
	public EvenMultiplication() {
	}

	/* (non-Javadoc)
	 * @see com.prismit.example.oops.TableMultiplication#multiplication(int)
	 */
	public void multiplication(int num) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter number");
		 num = sc.nextInt();

		for (int index=1; index <= 10; index++) {
			
			if (index++ % 2== 0) {
				System.out.println(num + "*" + index + "=" + (num * index));
			} 
		}
	}

}
