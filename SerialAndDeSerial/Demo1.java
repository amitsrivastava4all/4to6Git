import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
	 int id;
	private String name;
	Employee(int id , String name){
		this.id  = id;
		this.name = name;
		System.out.println("Employee Param Cons Call");
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
}
public class Demo1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee ram = new Employee(1001, "Ram");
		ram.id++;
		FileOutputStream fo = new FileOutputStream("D:\\4to6batch\\Emp.dat");
		ObjectOutputStream os = new ObjectOutputStream(fo); 
		os.writeObject(ram);
		os.close();
		fo.close();
		System.out.println("Object Store in a File");
		FileInputStream fi = new FileInputStream("D:\\4to6batch\\Emp.dat");
		ObjectInputStream oi = new ObjectInputStream(fi);
		Employee emp = (Employee)oi.readObject();
		System.out.println(emp);
		oi.close();
		fi.close();
		

	}

}
