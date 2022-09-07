package com.Bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	static Scanner sc = new Scanner(System.in);
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
		
	public static void validLastName() {
		
		System.out.println("enter last name");
		String lastName = sc.next();
	    boolean result = Pattern.matches("[A-Z]{1}[a-z]{2,}",lastName);
        if(result)
			System.out.println(lastName+" is a Valid Last Name");
		else
			System.err.println(lastName+" is an Invalid Last Name\n");
	}
	/*
	 * UC3 :  enter valid email
	 * e.g. abc.xyz@bl.co.in
	 * email has 3 mandatory fields abc,bl,co and 2 optional in,xyz
	 */
	public static void validMail()
	{
	     System.out.println("enter your mail: ");
	      String mail = sc.next();
	      boolean result = Pattern.matches("^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$",mail);  
	      if(result) {
	         System.out.println("mail is valid");
	      } else {
	         System.out.println("mail is not valid");
	      }
	      
	}
	/*
	 * UC4 enter valid mobile number
	 */
	public static void validMobileNum()
	{
	     System.out.println("enter your mobile number: ");
	      String mobileNum = sc.next();
	      boolean result = Pattern.matches("^[+0-9]{3}[0-9]{10}$",mobileNum);  
	      if(result) {
	         System.out.println("number is valid");
	      } else {
	         System.out.println("number is not valid");
	      }
	}
	/*
	 * UC 7 : as a user need to follow pre-defined password rules
	 * rule 3 : password must have atleast 1 numeric value
	 */
	public static void validPassword()
	{
	     System.out.println("enter a password(min 8 characters): ");
	      String password = sc.next();
	      boolean result = Pattern.matches("^(?=.*[A-Z])(?=.*[0-9])([a-z0-9]*([@#$%^&?*])*).{8,}$",password);  
	      if(result) {
	         System.out.println("password is valid");
	      } else {
	         System.out.println("password is not valid");
	      }
	      
	}

public static void main(String[] args) {
	
		validFirstName();
		validLastName();
		validMail();
		validMobileNum();
		validPassword();
	}
}

