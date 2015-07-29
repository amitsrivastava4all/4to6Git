
final class Immutable
{
	private final int A;
	private final int B;
	
	Immutable(){
		A= 100;
		B= 200;
	}
	
	Immutable(int a, int b){
		this.A = a;
		this.B = b;
	}
	
	public int getA(){
		return A;
	}
	
	public int getB(){
		return B;
	}
	
	
}


// final features
class A
{
	final int X = 100;  // First Way
	final int Y ;
	A(){
		System.out.println("Cons call");
		Y = 200; // Second Way
	}

}
public class ImmutableClass {

	public static void main(String[] args) {
		Immutable obj3 = new Immutable();
		
		Immutable obj = new Immutable(100, 200);
		System.out.println(obj.getA()+" "+obj.getB());
		obj = new Immutable(1007, 2800);

	}

}
