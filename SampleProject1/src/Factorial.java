/**
 * 
 */

/**
 * @author PRASHANTH
 *
 */
public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num=5,fact = 1;
		for(int index=1;index<=num;index++) {
			fact=fact*index;
		}
		System.out.println("print factorial: "+fact);
	}

}
