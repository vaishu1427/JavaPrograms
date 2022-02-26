package programs;

class Customer{
	private String customerid;
	private String name;
	private String address;
	private String num;
	
	//get
	
	public String getCustomerid() {
		return customerid;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getNum() {
		return num;
	}
		
	//set
	
	public void setAddress(String addre) {
		address=addre;
	}
	public void setNum(String nums) {
		num=nums;
	}
	
	//constructor
	
	public Customer(String id,String namme) {
		customerid=id;
		name=namme;
	}
	public Customer(String id,String namee,String add,String num) {
		customerid=id;
		name=namee;
		setAddress(add);
		setNum(num);
	}
	
	

}
public class UsingConstructor_Customer {

	public static void main(String[] args) {
		Customer c2=new Customer("sc3g","vaishnavi");
		Customer c=new Customer("s23gdv","vaishu","maharani Avenue","9050607080l");
		System.out.println(c.getCustomerid());
		System.out.println(c.getName());
		c.setAddress("madurai");
		System.out.println(c.getAddress());
		System.out.println(c.getNum());
		System.out.println();
		System.out.println(c2.getCustomerid());
		System.out.println(c2.getName());
		
		

	}

}
