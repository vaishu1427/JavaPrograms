package programs;
class Tv{
	public void switchOn() {
		System.out.println("TV is switched on");
	}
	public void changeChannel() {
		System.out.println("Changed the channel of tv");
	}
}
class SmartTv extends Tv{
	public void switchOn() {
		System.out.println("Smarttv is on");
	}
	public void changeChannel() {
		System.out.println("Changed the channel of smart tv");
	}
	public void browse() {
		System.out.println("Browsing the smart tv");
	}

}
public class UsingMethodOverriding_TV {

	public static void main(String[] args) {
		Tv s=new SmartTv();
		s.switchOn();
		s.changeChannel();
		s.browse();
	}

}
