/**
 * File Name: EvaluateMonth.java<br>
 * Nepton, Jean-francois<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 23, 2016
 */
package com.sqa.jf.basics;

import java.util.*;

/**
 * EvaluateMonth //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nepton, Jean-francois
 * @version 1.0.0
 * @since 1.0
 */
public class EvaluateMonth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare local variables
		String input;
		// Creating a Scanner object and setting to keyboard input
		Scanner scanner = new Scanner(System.in);
		// Ask user for a number of a month
		System.out.print("What number would you like to input:");
		// Get input from user and set into input variable
		input = scanner.nextLine();
		// Switch statement for month based on input
		switch (input) {
		// Case for January
		case "1":
			System.out.println("January");
			break;
		// Case for February
		case "2":
			System.out.println("February");
			break;
		// Case for March
		case "3":
			System.out.println("March");
			break;
		// Case for April
		case "4":
			System.out.println("April");
			break;
		// Case for May
		case "5":
			System.out.println("May");
			break;
		// Case for June
		case "6":
			System.out.println("June");
			break;
		// Case for July
		case "7":
			System.out.println("July");
			break;
		// Case for August
		case "8":
			System.out.println("August");
			break;
		// Case for September
		case "9":
			System.out.println("September");
			break;
		// Case for October
		case "10":
			System.out.println("October");
			break;
		// Case for November
		case "11":
			System.out.println("Novemeber");
			break;
		// Case for December
		case "12":
			System.out.println("December");
			break;
		default:
			System.out.println("Invalid Number");
			break;
		}
		// Exit application
		System.out.println("Good Bye!");
	}
}
