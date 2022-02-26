package programs;
class Cylinder{
	public double radius;
	public double height;
	public double lidArea() {
		return Math.PI*radius*radius;
	}
	public double Circumference() {
		return Math.PI*(2*radius);
	}
	public double totalSurface() {
		return Circumference()*(height+radius);
	}
	public double volume() {
		return lidArea()*height;
	}
}
public class UsingClassAndObjects_Cylinder {

	public static void main(String[] args) {
		Cylinder c1=new Cylinder();
		
		c1.radius=7;
		c1.height=10;
		System.out.printf("LidArea "+"%.2f\n",c1.lidArea());
		System.out.printf("Circumference "+"%.2f\n",c1.Circumference());
		System.out.printf("Total Surface "+"%.2f\n",c1.totalSurface());
		System.out.printf("Volume "+"%.2f\n",c1.volume());

	}

}
