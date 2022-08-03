package com.assignmentday19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	static String firstNameRegex="^[A-Za-z]{3,}";
	static String lastNameRegex="^[A-Za-z]{3,}";
	static String emailRegex="^[A-za-z0-9]+([.+-][A-za-z0-9]+)?[@][a-z0-9]+[.][a-z]{2,3}([.][a-z]{2})?$";
	static String mobNumberRegex="^[0-9]{2}\s[0-9]{10}$";
	
	
      static Pattern pattern;
      static Matcher matcher;
      
      public static boolean firstName(String firstName) {
    	   pattern =Pattern.compile(firstNameRegex);
    	  matcher=pattern.matcher(firstName);
    	  return matcher.matches();
      }

      public static boolean lastName(String lastName) {
      	   pattern =Pattern.compile(lastNameRegex);
      	  matcher=pattern.matcher(lastName);
      	  return matcher.matches();
      	  
        }

      public static boolean email(String email) {
     	   pattern =Pattern.compile(emailRegex);
     	  matcher=pattern.matcher(email);
     	  return matcher.matches();
     	  
       }
      public static boolean mobNumber(String mobNumber) {
     	   pattern =Pattern.compile(mobNumberRegex);
     	  matcher=pattern.matcher(mobNumber);
     	  return matcher.matches();
     	  
       }
	public static void main(String[] args) {
		System.out.println("First Name=" +firstName("Afrin"));
		System.out.println("Last Name=" +lastName("Fatma"));
		System.out.println("Email=" +email("abc.xyz@bridgelabz.co.in"));
		System.out.println("Mobile Number=" +mobNumber("91 9852453123"));
	}

}
