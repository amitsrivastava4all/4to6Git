
public class StringChange {

	public static void main(String[] args) {
		String type="mobile";
		double price = 20000;
		StringBuilder sb = new StringBuilder("select * from products");
		//StringBuffer sb = new StringBuffer("select * from products");
		//StringBuffer sb = new StringBuffer(2000);
		//sb.append("select * from products");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		/*String sql = "select * from products";
		*/
		if(type!=null){
			sb.append(" where type=").append(type);
			//sql = sql + " where type = "+type;
		}
		System.out.println("*********************** ");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		if(price>0){
			sb.append(" and price=>").append(price);
			//sql = sql + " and price >"+price;
		}
		System.out.println("*********************** ");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.ensureCapacity(1200);
		sb.append("hgkjdhfgkhfdkghkfdhgkhfdgfdhglfdhghdfgkjhfdkjghdfkjgkfdjgfdgfdjgjkfdkgdfjgdjfgkjdfjgkjhkghfdhkfdhgkhdfkghkfdhgkhfdhghkfdgfdgfdgfdg");
		System.out.println("After Bulk*********************** ");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}

}
