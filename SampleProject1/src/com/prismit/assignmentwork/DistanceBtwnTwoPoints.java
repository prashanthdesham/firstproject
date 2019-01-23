/**
 * distance between two points
 */
package com.prismit.assignmentwork;

/**
 * @author PRASHANTH
 *
 */
public class DistanceBtwnTwoPoints {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x1,x2,y1,y2;
		x1=1;
		x2=2;
		y1=3;
		y2=4;
		double dis;
		dis=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("distance betweeen"+"("+x1+","+y1+")"+"("+x2+","+y2+")"+"is: "  +dis);
		
	}

}
