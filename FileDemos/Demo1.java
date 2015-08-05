import java.io.File;
import java.io.IOException;


public class Demo1 {

	public static void main(String[] args) throws IOException {
		//File file = new File("D:\\4to6batch\\FilesOperations\\Demo.java");
		File file = new File("D:\\4to6batch\\FilesOperations\\x\\y\\z\\w\\s");
		//file.mkdir();
		file.mkdirs();
		/*if(file.exists()){
			System.out.println("File Already Exist");
			file.delete();
		}
		else{
		file.createNewFile();
		System.out.println("File Created...");
		}*/
	}

}
