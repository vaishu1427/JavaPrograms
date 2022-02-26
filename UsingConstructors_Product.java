package programs;

class Product{
	private String itemno;
	private String name;
	private double price;
	private int quantity;
	
	//get
	
	public String getItemno() {
		return itemno;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	
	//set
	
	
	public void setPrice(double p) {
		price=p;
	}
	public void setQuantity(int q) {
		quantity=q;
	}
	
	//constructors
	
	public Product(String item,String nam) {
		itemno=item;
		name=nam;
	}
	public Product(double pric,int quan) {
		setPrice(pric);
		setQuantity(quan);
	}
	
	
}
public class UsingConstructors_Product {

	public static void main(String[] args) {
		Product pr1=new Product("1542A","VAISHU"); // we can have more than one constructor in a program 
		Product pr2=new Product(20d, 3);
		System.out.println(pr1.getItemno());
		System.out.println(pr1.getName());
		System.out.println(pr2.getPrice());
		System.out.println(pr2.getQuantity());

	}

}
