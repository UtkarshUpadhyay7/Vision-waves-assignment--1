package assignment;
import java.util.Scanner;

public class MinimumBalance {

	public static void main(String[] args) {
		
		// 1]  Creating an Scanner class :
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the amount");
		int amountwithdraw= sc.nextInt();
		
		
		int minimum_balance = 1000;
		
		
		// 3] Writing logic in an try and catch block
		
		try {
			
			// risk code or false condition
			if(amountwithdraw > minimum_balance) {
				throw new MinimumBalanceException("Users don't have enough balance");
			}
			
			System.out.println("Withdraw of " + amountwithdraw + " Successfull");
			minimum_balance = minimum_balance - amountwithdraw;
			System.out.println("Remaing Balance " +minimum_balance);		
		        
		
	}
		catch(MinimumBalanceException ex) {
			ex.printStackTrace();
			
		}
		finally {
			System.out.println("////  BANK OF UTKARSH ////");
		}

	}
	
}	
	// 2 ] creating an  custom exception class
	class MinimumBalanceException extends RuntimeException{
		public MinimumBalanceException(String msg) {        // Constructor 
			super(msg); // use of super class
		} 
	}

