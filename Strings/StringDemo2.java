class Y
{
	
}
public class StringDemo2 {

	public static void main(String[] args) {
		/*String a = "Hello";
		String b = a.toUpperCase();
		System.out.println(b);
		System.out.println(a);
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb.toString());*/
		
		//String Methods 
		String x = "Hello";
		System.out.println(x.length());
		System.out.println(x.toUpperCase());
		System.out.println(x.toLowerCase());
		System.out.println(x.charAt(0));
		System.out.println(x.substring(2));
		System.out.println(x.substring(2,5));
		x = "     Ram Kumar Shyam Kumar     ";
		System.out.println("Without trim ["+x+"]");
		System.out.println("With trim ["+x.trim()+"]");
		x = "Ram Kumar Shyam Kumar";
		System.out.println(x.indexOf("Ku"));
		System.out.println(x.lastIndexOf("Ku"));
		System.out.println(x.contains("Ku"));
		System.out.println(x.startsWith("Ram"));
		System.out.println(x.endsWith("Kumar"));
		String temp = "A-111, Flat No-10, Sector -9, Delhi";
		String array[] = temp.split(",");
		System.out.println(array.length);
		for(String z :array){
			System.out.println(z);
		}
		byte v[] = temp.getBytes();
		char c[] = temp.toCharArray();
		int r[] =new int[10];
		Y obj = new Y();
		System.out.println("int[] is "+r);
		System.out.println("Y is "+obj);
		int t = 900;
		String z = String.valueOf(t);
		String c1  = new String();
		
		
		
		
		
		

	}

}
