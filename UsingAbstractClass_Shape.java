package programs;
abstract class Shapee{
	abstract public void perimeter();
	abstract public void area();
}
class Circl extends Shapee{
	int radius;
	public void perimeter() {
		System.out.println(2*Math.PI*radius);
	}
	public void area() {
		System.out.println(Math.PI*radius*radius); 
	}
	public Circl(int r) {
		radius=r;
	}
}
class Rectangl extends Shapee{
	int length;
	int breadth;
	public Rectangl(int l,int b) {
		length =l;
		breadth=b;
	}
	public void perimeter() {
		System.out.println(2*(length+breadth));
	}
	public void area() {
		System.out.println(length*breadth);
	}
}
public class UsingAbstractClass_Shape {

	public static void main(String[] args) {
		Shapee c=new Circl(2);
		
		c.area();

	}

}
