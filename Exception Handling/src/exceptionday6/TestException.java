package exceptionday6;

import java.util.InputMismatchException;
import java.util.Scanner;
public class TestException {

	public static void main(String[] args) {
		
		//int s=10/0;
		//throw new ArithmeticException("Cannot divide by zero");
		
		System.out.println("Program task begins");
		try {
			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = a/b;
			System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println("cannot divide by 0");
		}catch(InputMismatchException e) {
			System.out.println("Invalid input format");
		}
		System.out.println("Program completed task");
	}

}
