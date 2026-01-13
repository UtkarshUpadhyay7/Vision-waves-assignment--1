package Assignment120126;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 int correctpassword = 1357;
		 
		 for(int i=0;i<3;i++) {
		 System.out.println("Enter password");
		 int login = sc.nextInt();
		try {
			if(i==2) {
				if(login!=correctpassword) {
					throw new LoginAttemptExceededException("Account Locked");
					
				}
			}
			if(login==correctpassword) {
				System.out.println("Access Granded");
				break;
			}
			 
		}
		catch(LoginAttemptExceededException ob) {
			ob.printStackTrace();
		}
	}
		
	}
}
class LoginAttemptExceededException extends RuntimeException{
	public LoginAttemptExceededException(String msg) {
		super (msg);
	}
}
