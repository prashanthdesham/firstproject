/**
 * for try and catch:
 */

/**
 * @author PRASHANTH
 *
 */
public class Try {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * this is main method
		 */
		int num1=5,num2=0,div;
		try {
		div=num1/num2;
		System.out.println("division of numbers :"+div);
		}catch(ArithmeticException e){
			System.out.println("zero never diveded with any number");
			
		}
		
		
	}

}
