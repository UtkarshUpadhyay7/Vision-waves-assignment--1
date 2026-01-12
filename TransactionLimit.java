package assignment;
import java.util.Scanner;

public class TransactionLimit {

	public static void main(String[] args) {

       //1] Creating an Scanner class
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the amount ");
		int amount = sc.nextInt();
		
		sc.close();
		
		
		
		try {
			if(amount>50000) {
				throw new TransactionLimitExceededException("Limit exceed");
			}
			System.out.println("Transaction Successfull");
		}
		catch(TransactionLimitExceededException ee) {
			ee.printStackTrace();
		}
		
		finally{
			System.out.println("This blocks always executes");
		}

	}
}
	  // 2] Creating an exception class
	
	class TransactionLimitExceededException extends RuntimeException{
		 public TransactionLimitExceededException(String msg) {
			 super(msg);
		 }
	}

