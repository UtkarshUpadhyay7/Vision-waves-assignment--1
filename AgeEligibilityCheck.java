package assignment;

import java.util.Scanner;

public class AgeEligibilityCheck {

	public static void main(String[] args) {
		
		// 1] Creating an Scanner Class
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age !");
		int age = sc.nextInt();
		
		// 3] Exception Mechanisms
		try {
		
		if(age<=21 || age >35) {
			throw new InvalidAgeException("User not eligible for job");
		}
		System.out.println("User is  eligible for job");
	}
		catch(InvalidAgeException ag) {
			ag.printStackTrace();
		}
	}
	
}
	// 2] Creating my own exception class
	
	class InvalidAgeException extends RuntimeException{
		public InvalidAgeException(String msg) {
			super(msg);
		}
		
		
	}
	
	

