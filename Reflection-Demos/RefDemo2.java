import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class T
{
	private int s, s2 , s3;
	public int y, y2, y3;
	protected int g;
	static int h;
	final int k=99;
	void show(){
		
	}
	void disp(){
		
	}
	
}
public class RefDemo2 {

	public static void main(String[] args) {
		Class cls = T.class;  // Meta 
		//Class cls = new T().getClass();  // Meta + data
		Field fields[] = cls.getDeclaredFields();
		for(Field field : fields){
			if(Modifier.isPrivate(field.getModifiers())){
				System.out.println("Private "+field.getName());
			}
			else
			if(Modifier.isPublic(field.getModifiers())){
				System.out.println("public "+field.getName());
			}
			else
			if(Modifier.isStatic(field.getModifiers())){
				System.out.println("Static "+field.getName());
			}
			else
				if(Modifier.isProtected(field.getModifiers())){
					System.out.println("Protected "+field.getName());
				}
				else
					if(Modifier.isFinal(field.getModifiers())){
						System.out.println("Final "+field.getName());
					}
		}

	}

}
