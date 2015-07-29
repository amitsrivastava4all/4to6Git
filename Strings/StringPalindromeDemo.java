
public class StringPalindromeDemo {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("nitin");
		StringBuffer sb2 = new StringBuffer("nitin");
		sb2.reverse();
		if(sb1.toString().equals(sb2.toString())){
			System.out.println("Same ");
		}
		else
		{
			System.out.println("Not Same");
		}
		

	}

}
