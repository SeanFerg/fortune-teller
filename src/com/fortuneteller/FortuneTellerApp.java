package com.fortuneteller;

import java.util.Scanner;

public class FortuneTellerApp {

	public static void main(String[] args) {
				
		Scanner input = new Scanner(System.in);

		// Get user first name
		System.out.println("What is your first name?");
		String firstName = input.nextLine();

		// Get user last name
		System.out.println("What is your last name?");
		String lastName = input.nextLine();

		// Get user's age
		System.out.println("What is your age?");
		int age = input.nextInt();

		// Get user's birth month (integer)
		System.out.println("What is your birth month (as a number)?");
		int birthMonth = input.nextInt();

		// Get user's favorite color
		System.out.println("What is your ROYGBIV color or enter help?");
		String favColor = input.nextLine();
		if (favColor.equals("help")) {
			System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet");
			System.out.println("What is your favorite color?");
			favColor = input.nextLine();
		}

		// Get user's number of siblings (integer)
		System.out.println("How many siblings do you have?");
		int siblings = input.nextInt();

		// Get user's # of yrs until retirement (based on odd or even age)
		String retire;
		
		if (age % 2 == 0) {
			retire = "16 years";
		} else {
			retire = "18 years";
		}

		// Vacation Home Location
		String location = " ";

		if
		(siblings == 0) {
		
			location = "Boca Raton, Fl";
		}

		if (siblings == 1) {
			location = "Nassau, Bahamas";
		}

		if (siblings == 2) {
			location = "Ponta Negra,Brazil";
		}

		if (siblings == 3) {
			location = "Portland, Oregon";
		}

		if (siblings > 3) {
			location = "Baton Rouge, LA";
		}

		if (siblings < 0) {
			location = "North Korea!!!";
		}

		// Mode of transportation
		String transportation = "";

		if (favColor.equals("red")) {
			transportation = "Maserati";
		}

		if (favColor.equals("orange")) {
			transportation = "stallion";
		}

		if (favColor.equals("yellow")) {
			transportation = "chariot";
		}

		if (favColor.equals("green")) {
			transportation = "taxi";
		}

		if (favColor.equals("blue")) {
			transportation = "rickshaw";
		}

		if (favColor.equals("indigo")) {
			transportation = "motor scooter";
		}

		if (favColor.equals("violet")) {
			transportation = "flying saucer";
		}

		// Bank Balance
		double bankBalance = 0.00;

		if (birthMonth < 1 || birthMonth > 12) {
			bankBalance = (int) 0.00;
		} else if (birthMonth > 0 && birthMonth < 5) {
			bankBalance = (int) 250000.00;
		} else if (birthMonth > 4 && birthMonth < 9) {
			bankBalance = (int) 3600000.00;
		} else if (birthMonth > 8 && birthMonth < 13) {
			bankBalance = (int) 86.00;
		}
		System.out.println(firstName + " " + lastName + " will retire in " + retire + "" + " with $" + bankBalance
				+ " in the bank," + " a vacation home in " + location + "" + ", and travel by " + transportation + ".");
	}
}

//	*[First Name]* *[Last Name]* will retire in *[# of years]* with *[bank balance]* in the bank,
//	a vacation home in *[location]*, and travel by *[mode of transporation]*.
