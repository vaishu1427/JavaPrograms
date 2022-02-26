package programs;
class Rec{
	int length;
	int breadth;
	int x=5;
	public void perimeter() {
		System.out.println(2*(length+breadth));
	}
	public Rec(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
}
class Cube extends Rec{
	int height;
	int x=10;
	public void volume() {
		System.out.println(length *breadth*height);
		System.out.println(super.x);                // Represents the parent class 
	}
	public Cube(int length,int breadth,int height) {
		super(length,breadth);
		this.height=height;
	}
	
}
public class Using_super {

	public static void main(String[] args) {
		Cube c=new Cube(10,20,30);
		System.out.println(c.x);      // Represents the child class
		c.perimeter();
		c.volume();
	}

}
