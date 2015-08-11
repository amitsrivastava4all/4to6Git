import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Case -1 When Parent is Serializable
// Case - 2 When Child is Serializable
class Parent implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int x;
	Parent(){
		x = 100;
		System.out.println("Parent Class Cons call");
	}
}
class Child extends Parent// implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	transient int y ;
	transient int m=90;
	int a=77,b=20;
	D obj = new D();
	Child(){
		y = 200;
		System.out.println("Child Class Cons call");
	}
}
class D implements Serializable
{
	int e;
	float g;
	long h;
	double t;
}
// Case -3 Has a RelationShip
public class IsACase {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Child child =new Child();
		child.x++;
		child.y++;
		FileOutputStream fo = new FileOutputStream("D:\\4to6batch\\isademo.dat");
		ObjectOutputStream os = new ObjectOutputStream(fo);
		os.writeObject(child);
		os.close();
		fo.close();
		System.out.println("Store...");
		FileInputStream fi = new FileInputStream("D:\\4to6batch\\isademo.dat");
		ObjectInputStream oi = new ObjectInputStream(fi);
		Child childObj = (Child)oi.readObject();
		System.out.println(childObj.x+" "+childObj.y);

	}

}
