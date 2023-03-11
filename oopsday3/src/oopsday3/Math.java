package oopsday3;
import java.util.Scanner;
public class Math {
	public static void main(String[] args) {
		
		Operations Operations = new Operations();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int number=sc.nextInt();
		Operations.setNumber(number);
		Operations.EvenorOdd();
		Operations.PrimeorNot();
		Operations.Factorial();
		Operations.PosorNeg();
		Operations.Reverse();
		Operations.SumofNos();
	}
}
