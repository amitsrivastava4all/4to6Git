import java.util.Scanner;

class Calc
{
	private int r = 1000;
	 int add(int x, int y){
		return x + y;
	}
	int subtract(int x, int y){
		return x - y;
	}
	int multiply(int x, int y){
		return x * y;
	}
	int divide(int x, int y){
		try {
			Thread.sleep(1200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x / y;
	}
	
}
public class WithOutReflection {

	public static void main(String[] args) {
		Calc obj = new Calc();
		int x = 100;
		int y = 200;
		int result = 0;
		System.out.println("Type Add for Add method");
		System.out.println("Type subtract for Subtract method");
		System.out.println("Type multiply for multiply method");
		System.out.println("Type divide for divide method");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Choice");
		String ch = scanner.next();
		if("add".equals(ch)){
			//result = obj.add(x, y);
		}
		else
		if("subtract".equals(ch)){
			result = obj.subtract(x, y);
		}
		else
		if("multiply".equals(ch)){
			result = obj.multiply(x, y);
		}
		else
		if("divide".equals(ch)){
			result = obj.divide(x, y);
		}
		System.out.println("Result is "+result);
	}

}
