package programs;
class Rectangle1{
	int length;
	int breadth;
	public Rectangle1(int x,int y ) {
		length=x;
		breadth=y;
	}
	public int perimeter() {
		return 2*(length+breadth);
	}
	
}
class Cuboid extends Rectangle1{
	int height;
	
	public Cuboid(int x,int y,int z) {
		super(x,y);
		height =z;
	}
	public int volume() {
		return length*breadth*height;
	}
}
public class ParametrisedConstructorInInheritance2 {

	public static void main(String[] args) {
		Cuboid s=new Cuboid(5,2,3);
		System.out.println("Volume of a cuboid is "+s.volume());
		System.out.println("Perimeter of a rectangle is "+s.perimeter());

	}

}
