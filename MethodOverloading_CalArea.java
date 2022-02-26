package programs;

public class MethodOverloading_CalArea {
	 
	// Calculate area of the rectangle and circle
	
	static double area(double le,double br) {
		double areaOfR=le*br;
		return areaOfR;
	}
	
	static double area(double ra) {
		double areaOfC=Math.PI*ra*ra;
		return areaOfC;
	}

	public static void main(String[] args) {
		System.out.println(area(20.0,10.0));
		System.out.println(area(3));

	}

}
