import java.util.Scanner;


public class ScannerDrawBack {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Age");
		int age = scanner.nextInt();
		System.out.println("Enter the Id ");
		int id = scanner.nextInt();
		System.out.println("Enter the Name");
		String name = scanner.nextLine();
		
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);

	}

}
