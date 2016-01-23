/**
 * File Name: EvaluateNumber.java<br>
 * Nepton, Jean-francois<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 23, 2016
 */
package com.sqa.jf.basics;

/**
 * EvaluateNumber //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nepton, Jean-francois
 * @version 1.0.0
 * @since 1.0
 */
public class EvaluateNumber {

	// Declare numbers for class
	static int num1 = 8;

	static int num2 = 12;

	static int num3 = 10;

	// Method declaration to evaluate the number
	public static void evaluateNumber(int num) {
		// If number is less than 10
		if (num < 10) {
			// Print details to console
			System.out.println("Number " + num + " is less than 10.");
			// If number is greater than 10
		} else if (num > 10) {
			// Print details to console
			System.out.println("Number " + num + " is greater than 10.");
			// If number is equal to 10
		} else if (num == 10) {
			// Print details to console
			System.out.println("Number " + num + " is equal to 10.");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Intro to app
		System.out.println("Number Evaluate App");
		// Call method or invoke method which evaluates number, num1
		evaluateNumber(num1);
		// Call method or invoke method which evaluates number, num2
		evaluateNumber(num2);
		// Call method or invoke method which evaluates number, num3
		evaluateNumber(num3);
	}
}
