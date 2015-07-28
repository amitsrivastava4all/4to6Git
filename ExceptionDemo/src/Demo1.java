import java.io.File;
import java.io.IOException;


public class Demo1 {

	public static void main(String[] args) throws IOException {
		String a = null;
		NullPointerException e;
		//System.out.println(a.length());  // throw new NullPointorException();
		System.out.println("After Length , this line never print");
		//int e = 10/0;
		
		File file = new File("D:\\JavaCodes\\abcd.txt");
		file.createNewFile();
		
	}

}
