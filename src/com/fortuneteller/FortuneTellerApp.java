package com.fortuneteller;

import java.util.Scanner;

public class FortuneTellerApp {

	public static void main(String[] args) {
				// Create scanner to get user input
				Scanner input = new Scanner(System.in);
				
				// Get user first name
				System.out.println("What is your first name?");
				String firstName = input.nextLine();
				input.nextLine();
				
				// Get user last name
				System.out.println("What is your last name?");
				String lastName = input.nextLine();
				input.nextLine();

				// Get user's age
				System.out.println("What is your age?");
				int age = input.nextInt();
				input.nextLine();
				
				// Get user's birth month (integer)
				System.out.println("What is your birth month (as a number)?");
				int birthMonth = input.nextInt();
				input.nextLine();
				
				// Get user's favorite color
				System.out.println("What is your ROYGBIV color or enter Help?");
				String favColor = input.nextLine();
//				If String favColor = "Help" {
					System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet");
				}
				
				
					
				



	}

}
