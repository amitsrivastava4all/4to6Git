import java.util.InputMismatchException;
import java.util.Scanner;


public class Demo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int firstNum = 0;
		int secondNum  = 0;
		int result =0;
		try{
		System.out.println("Enter the Number");
		firstNum = scanner.nextInt(); //ten\n
		}
		catch(InputMismatchException e){
			System.out.println("Only Number Allowed U entered the Alpha "+e);
			scanner.nextLine();
			System.out.println("Enter the Number Again");
			firstNum = scanner.nextInt();
		}
		try{
		System.out.println("Enter the Second Number");
		secondNum = scanner.nextInt();
		}
		catch(InputMismatchException e){
			System.out.println("Only Number Allowed U entered the Alpha "+e);
			scanner.nextLine();
			System.out.println("Enter the Second Number Again");
			secondNum = scanner.nextInt();
		}
		try{
		result = firstNum/ secondNum;  // throw new ArithmeticException()
		
		}
		catch(ArithmeticException e){
			System.out.println("U Divide a number with Zero "+e);
			System.out.println("Enter the Second Number Again");
			secondNum = scanner.nextInt();
			
		}
		System.out.println("Result is "+result);
		
	}

}
