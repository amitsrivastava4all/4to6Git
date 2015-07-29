// How to compare 2 objects are same or not

class Customer
{
	private int id;
	private String name;
	String address;
	double dues;
	Customer(int id , String name, String address, double dues){
		this.id = id;
		this.name = name;
		this.address = address;
		this.dues = dues;
	}
	
	@Override
	public String toString(){
		return "Id "+id+" Name "+name +" Address "+address +" Dues "+dues;
	}
	
	@Override
	public boolean equals(Object o){
		Customer ram =this;
		boolean isMatch = false;
		Customer c = (Customer)o;
		if(this.id == c.id  && this.name.equals(c.name)
				&& this.address.equals(c.address) && this.dues==c.dues){
			isMatch = true;
		}
		return isMatch;
		
	}
	
	
}
public class ObjectEquals {

	public static void main(String[] args) {
		Customer ram = new Customer(1001,"Ram","Rohini",9000);
		Customer ram2 = new Customer(1001,"Ram","Rohini",9000);
		System.out.println(ram);
		System.out.println(ram2);
		if(ram.equals(ram2)){
			System.out.println("Same Objects");
		}
		else
		{
			System.out.println("Not Same Objects");
		}
		
	}

}
