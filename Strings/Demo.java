interface X
{
	
}
class XImpl implements X
{
	
}
class XImpl2 implements X
{
	
}
class Factory
{
	static XImpl2  getObject(XImpl obj){
		return new XImpl2();
	}
}
public class Demo {

	public static void main(String[] args) {
		int y = 100;
		int x = (int)(Math.random()*y);
		X obj = (X)Factory.getObject(new XImpl());
		

	}

}
