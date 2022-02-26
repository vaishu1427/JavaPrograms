package programs;
class Rectanglee{
	int length;
	int breadth;
	
	public Rectanglee(int length,int breadth) {
		this.length=length;                       // we used 'this' keyword because the parameter and the reference names are same . so we are differentiating the reference with the keyword 'this'.
		this.breadth=breadth;
	}
	public int perimeter() {
		return 2*(length+breadth);
	}
	
}
class Cuboidd extends Rectanglee{
	int height;
	public Cuboidd(int length,int breadth,int height) {
		super(length,breadth);
		this.height=height;
	}
	public int volume() {
		return length*breadth*height;
	}
}
public class Using_This {

	public static void main(String[] args) {
		Cuboid c=new Cuboid(10,20,30);
		System.out.println("System.out.println "+c.volume());
		System.out.println("System.out.println "+c.perimeter());
	}

}
