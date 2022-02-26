package programs;

class Rectangle{
	public int length;
	public int breadth;
	public int Area() {
		return length*breadth;
	}
	public int perimeter() {
		return 2*(length+breadth);
	}
	public boolean isSquare() {
		if(length==breadth) {
			return true;
		}
	return false;
	}
}

public class UsingClassAndObjects_Rectangle {

	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		r1.length=4;
		r1.breadth=3;
		System.out.println(r1.Area());
		System.out.println(r1.perimeter());
		System.out.println(r1.isSquare());

	}

	
}
