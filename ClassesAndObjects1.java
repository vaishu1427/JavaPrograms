package programs;

// creating objects and classes for the circle


class Circle{
	public double radius;
	public double Area() {
		return Math.PI*radius*radius;
	}
	public double perimeter(){
		return 2*Math.PI*radius*radius;
	}
	public double circumference() {
		return perimeter();
	}
}

public class ClassesAndObjects1 {

	public static void main(String[] args) {
		Circle c1=new Circle();
		Circle c2=new Circle();
		System.out.println(c1+" "+c2); // To check whether the reference are referring to the same objects or not.
		c1.radius=7;
	    c2.radius=14;
	    
		System.out.println(c1.Area());
		System.out.println(c1.perimeter());
		System.out.println(c1.circumference());
		
		System.out.println(c2.Area());
		System.out.println(c2.perimeter());
		System.out.println(c2.circumference());

	}

}
