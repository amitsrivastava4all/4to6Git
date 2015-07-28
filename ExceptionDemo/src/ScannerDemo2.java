import java.util.Scanner;


public class ScannerDemo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner("Hello -how are you");
		scanner.useDelimiter("[-]");
		//System.out.println(scanner.next());
		while(scanner.hasNext()){
			System.out.println(scanner.next());
		}

	}

}
