
public class StringDemo1 {//extends Object {

	public static void main(String[] args) {
		// 1 or 0 Object
		String a = "Hello";  // String literal
		String b = "Hello".intern();  // "Hello";
		// 2 or 1
		String c = new String("Hello").intern();  //every time it create a new object in Heap
		if(a==c){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}
		String e = "bye";
		a = a + e;
		a= "Hello";
		if(a==b){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}
	}

}
