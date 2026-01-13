package assignment;
import java.util.Scanner;

public class InvalidloginAttempts {

	public static void main(String[] args) {
		
		// 1] Crating an  Scanner class
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the password");
		int pass = sc.nextInt();
		
		int correctpass=1807;
		
		
		
		
		// 3] Main logic and try and catch block
		
		try {
			if(pass!=correctpass) {
				throw new LoginAttemptExceededException("Account locked");
			}
			else {
				System.out.println("Account Login");
			}
		}
		catch(LoginAttemptExceededException ee) {
			ee.printStackTrace();
		}
		
	}
	
	}

	// 2] Creating an custom Exception
	 class LoginAttemptExceededException extends RuntimeException{
		 public LoginAttemptExceededException(String msg) {
			 super(msg);
		 }
	 }

