package assignment;
import java.util.Scanner;

public class StudentMarksValidation {

	public static void main(String[] args) {
	
		// 1] Creating an Scanner class
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the marks");
		int marks  = sc.nextInt();
		
		
		// 3] main logic and try and catch block
		
		try {
			if(marks<0 || marks>100) {
				throw new InvalidMarksException("Invalid marks");
			}
			System.out.println("Valid marks ");
		}
		catch(InvalidMarksException m) {
			m.printStackTrace();
		}
		finally {
			System.out.println("==Normal School==");
		}

	}
}

	// 2] Creating an Exception class
	
	class InvalidMarksException  extends RuntimeException{
		public InvalidMarksException(String msg) {
			super(msg);
		}
	}

