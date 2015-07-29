
public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuilder sb  = new StringBuilder("Hi");
		//StringBuffer sb = new StringBuffer("Hi");
		sb.append("Hello");
		sb.insert(1, "Ok");
		System.out.println(sb);
		sb.deleteCharAt(0);
		System.out.println(sb);
		sb.delete(2, 4);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.charAt(0);
		sb.ensureCapacity(200);
		StringBuffer sb2 = new StringBuffer("hello");
		char x[] = new char[10];
		sb2.getChars(0, 2, x, 0);
		String v = new String(x);
		System.out.println(v);
		
		
		

	}

}
