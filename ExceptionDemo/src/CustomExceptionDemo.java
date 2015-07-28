import java.util.Scanner;

// Checked 
// Step -1 Always Inherit the Exception or RuntimeException
// Depends on If u want to Create Checked or Unchecked Exception

// Step - 2 create toString 
class MinorAgeException extends Exception 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int age;
	MinorAgeException(int age){
		this.age = age;
	}
	@Override
	public String toString(){
		return "Only 18 and Above can Apply for this "+age ;
	}
}
public class CustomExceptionDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Age");
		int age = scanner.nextInt();
		if(age>=18){
			System.out.println("Apply for VOTERID");
			System.out.println("Apply for PAN");
			System.out.println("Apply for License");
		}
		else
		{
			try{
				throw new MinorAgeException(age);
				//Code
			}catch(MinorAgeException e){
				System.out.println(e.toString());
			}
		}

	}

}
