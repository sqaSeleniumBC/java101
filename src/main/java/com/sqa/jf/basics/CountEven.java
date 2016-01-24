/**
 * File Name: CountEven.java<br>
 * Nepton, Jean-francois<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 23, 2016
 */
package com.sqa.jf.basics;

/**
 * CountEven //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nepton, Jean-francois
 * @version 1.0.0
 * @since 1.0
 */
public class CountEven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 2345235;
		if (num % 5 == 0) {
			System.out.println(num + " is divisible by 5.");
		} else {
			System.out.println(num + " is NOT divisible by 5.");
		}
	}
}
