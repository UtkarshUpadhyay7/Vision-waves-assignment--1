package assignment;
import java.util.Scanner;

public class InvalidloginAttempts {

	public static void main(String[] args) {
		
		// 1] Crating an  Scanner class
		Scanner sc = new Scanner(System.in);
		
	
		
		int correctpass=1807;
		
			
		// 3] Main logic and try and catch block
		
	     for(int i=0;i<3;i++) {
	        	System.out.println("Enter The Password :- ");
	            int pass=sc.nextInt();
	        	try {
	        		if(i==2) {
	        		if(pass!=correctpass) {
	        			throw new LoginAttemptExceededException("LoginAttemptExceedException");
	        		}
	        		System.out.println("Access Granted");
	        		}
	        	}
	        	catch(LoginAttemptExceededException ob) {
	        		ob.printStackTrace();
	        	}
	        }
	        sc.close();
	        
		}

	}
	// 2] Creating an custom Exception
	 class LoginAttemptExceededException extends RuntimeException{
		 public LoginAttemptExceededException(String msg) {
			 super(msg);
		 }
	 }

