package com.fortuneteller;

import java.util.Scanner;

public class FortuneTellerApp {

	public static void main(String[] args) {
		// Create scanner to get user input....due 8/30/18 by 9am
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
		input.nextLine();
		
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

		//Get user's # of yrs until retirement (based on odd or even age)	
		if(age % 2 == 0) {
		System.out.println("You will retire in 18 years");
		} 
		else {
		System.out.println("You will retire in 16 years");
		}
	
	// Vacation Home Location
	// for (int i =0; i < siblings.length; i++) {
		if (siblings == 0){
		System.out.println("a vacation home in Boca Raton, Fl");
		}
		if (siblings == 1){
		System.out.println("a vacation home in Nassau, Bahamas");
		}
		if (siblings == 2) {
		System.out.println("a vacation home in Ponta Negra,Brazil");
		}
		if (siblings == 3) {
		System.out.println("a vacation home in Portland, Oregon");
		}
		if (siblings > 3) {
		System.out.println("a vacation home in Baton Rouge, LA");
		}
		if (siblings < 0) {
		System.out.println("a vacation home in North Korea!!!");
		}
	
		// Mode of transportation
		if (favColor.equals("red")) {
		System.out.println("and travel by Maserati");
		}
		if (favColor.equals("orange")) 
		{
		System.out.println("and travel by stallion");
		}		
		if (favColor.equals("yellow"))
		{
		System.out.println("and travel by chariot");
		}
		if (favColor.equals("green"))
		{
		System.out.println("and travel by taxi");
		}
		if (favColor.equals("blue"))
		{
		System.out.println("and travel by rickshaw");
		}
		if (favColor.equals("indigo"))
		{
		System.out.println("and travel by motor scooter");
		}
		if (favColor.equals("violet"))
		{
		System.out.println("and travel by flying saucer");
		}
		
//		Bank Balance
		if (birthMonth < 1 || birthMonth > 12) {
		System.out.println("balance will be $0.00");
		}
		else {}
		if (birthMonth > 0 && birthMonth < 5) {
		System.out.println("balance will be $250,000.00");
		}
		else {}
		if (birthMonth > 4 && birthMonth < 9) {
		System.out.println("balance will be $3,600,000.00");
		}
		else {}
		if (birthMonth > 8 && birthMonth < 13) {
			System.out.println("balance will be $86.00");	
		}
		}
}

//	for (int i=0; i < siblings; i++) {
//		total+= siblings[i];
//	}
//}
//System.out.println("The total is " + total);
//