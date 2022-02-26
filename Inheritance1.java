package programs;
class Circlee{
	public double radius;
	public double area() {
		double a= Math.PI * radius *radius;
		return a;
	}
}
class Cylinderr extends Circlee{
	public double height;
	
	public double volume() {
		double v=area()*height;
		return v;
	}
	
}
public class Inheritance1 {

	public static void main(String[] args) {
		Cylinderr c=new Cylinderr();
		c.radius=10;
		c.height=5;
		System.out.println("Area "+c.area());
		System.out.println("Volume "+c.volume());
		

	}

}
