package com.Bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

		static Scanner sc = new Scanner(System.in);
		// UC1 check for valid first name
		public static void validFirstName() {
		
			System.out.println("enter your first name");
			String firstName = sc.next();
		    boolean result = Pattern.matches("[A-Z]{1}[a-z]{2,}",firstName);
	        if(result)
				System.out.println(firstName+" is a Valid First Name");
			else
				System.err.println(firstName+" is an Invalid First Name");
	        System.out.println(" ");
		}
		//UC2 check for valid last name
		
		public static void validLastName() {
			
			System.out.println("enter last name");
			String lastName = sc.next();
		    boolean result = Pattern.matches("[A-Z]{1}[a-z]{2,}",lastName);
	        if(result)
				System.out.println(lastName+" is a Valid Last Name");
			else
				System.err.println(lastName+" is an Invalid Last Name\n");
		}

	public static void main(String[] args) {
		System.out.println("welcome to user registration");	
			validFirstName();
			validLastName();
		}
}

