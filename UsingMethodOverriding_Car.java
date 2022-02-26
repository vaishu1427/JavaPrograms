package programs;
class Car{
	public void start() {
		System.out.println("car is started");
	}
	public void accelerate() {
		System.out.println("car accelerated");
	}
	public void gear() {
		System.out.println("gear changed of the car");
	}
}
class LuxuryCar extends Car{
	
	public void gear() {
		System.out.println("gear changed of the luxury car");
	}
	public void openroof() {
		System.out.println("roof opened");
	}
}
public class UsingMethodOverriding_Car {

	public static void main(String[] args) {
		LuxuryCar l=new LuxuryCar();
		l.start();
		l.accelerate();
		l.gear();
		l.openroof();

	}

}
