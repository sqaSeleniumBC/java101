/**
 * File Name: EvaluateGrade.java<br>
 * Nepton, Jean-francois<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 23, 2016
 */
package com.sqa.jf.basics;

import java.util.*;

/**
 * EvaluateGrade //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nepton, Jean-francois
 * @version 1.0.0
 * @since 1.0
 */
public class EvaluateGrade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare local variables
		String input;
		int gradeValue;
		// Create a Scanner object and assign to variable scanner
		Scanner scanner = new Scanner(System.in);
		// Request a grade value from the user
		System.out.println("Please input grade value (0-100):");
		// Set user defined input to variable input
		input = scanner.nextLine();
		// Convert the String input to a number
		gradeValue = Integer.parseInt(input);
		// Evaluate if grade value
		if (gradeValue >= 80) {
			// Output that the grade is over 90 = A.
			System.out.println("Grade is an A.");
		} else if (gradeValue >= 70) {
			// Output that the grade is over 80 = B.
			System.out.println("Grade is an B.");
		} else if (gradeValue >= 60) {
			// Output that the grade is over 90.
			System.out.println("Grade is an C.");
		} else if (gradeValue >= 50) {
			// Output that the grade is over 90.
			System.out.println("Grade is an D.");
		} else {
			// Output that the grade is over 90.
			System.out.println("Grade is an F.");
		}
	}
}
