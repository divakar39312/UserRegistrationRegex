package com.Bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {


		static Scanner sc = new Scanner(System.in);
		//firstname validation
		public static void validFirstName() {
		
			System.out.println("enter your first name");
			String firstName = sc.next();
		    boolean result = Pattern.matches("[A-Z]{1}[a-z]{2,}",firstName);
	        if(result)
				System.out.println(firstName+" is a Valid First Name");
			else
				System.err.println(firstName+" is an Invalid First Name");
		}
		
	public static void main(String[] args) {
		System.out.println("welcome to user registration program ");	
			validFirstName();
		}

}

