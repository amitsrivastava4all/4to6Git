import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;


public class WithReflection {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Object object = Class.forName("Calc").newInstance();
		//Calc obj = new Calc();
		int x = 100;
		int y = 200;
		int result = 0;
		System.out.println("Type Add for Add method");
		System.out.println("Type subtract for Subtract method");
		System.out.println("Type multiply for multiply method");
		System.out.println("Type divide for divide method");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Choice");
		String ch = scanner.next();
		Class cls = object.getClass();  // It will give Data and Meta Data of a Class 
		Method method = cls.getDeclaredMethod(ch, int.class,int.class); // Method Runtime Resolve
		method.setAccessible(true); // Access Rights to Access Private things in a class
		Object returnValue = method.invoke(object, x,y);
		System.out.println("Result is "+returnValue);
		
		// Access Fields 
		Field field = cls.getDeclaredField("r");  // Field Resolve
		field.setAccessible(true);  // Access 
		Object value = field.get(object);  // obj.r ;
		System.out.println("Value is "+value);
		field.set(object, 9090);
		value = field.get(object);  // obj.r ;
		System.out.println("Now New Value is "+value);
		
		// this code requried when u need all the methods
		/*Method methods [] = cls.getDeclaredMethods(); // It will give all the class methods
		for(Method method: methods){
			System.out.println(method.getName());
		}*/
		
		/*if("add".equals(ch)){
			result = obj.add(x, y);
		}
		else
		if("subtract".equals(ch)){
			result = obj.subtract(x, y);
		}
		else
		if("multiply".equals(ch)){
			result = obj.multiply(x, y);
		}
		else
		if("divide".equals(ch)){
			result = obj.divide(x, y);
		}
*/		
		int w = 100;
		Integer s = w; // AutoBoxing 1.5
		Object t = s;  // Upcasting
		System.out.println(t);
		System.out.println(s.toString());
		Integer f1 = 128;  // 1 byte Pool (-128 to 127)
		Integer f2 = 128;
		if(f1==f2){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}

	}

}
