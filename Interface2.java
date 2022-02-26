package programs;
class Phone{
	void call(){
		System.out.println("call");
	}
	void sms() {
		System.out.println("sms");
	}
}
interface Camera{
	void click();
	void record();
}
interface MusicPlayer  {
	void play();
	void pause();
	void stop();
}
class SmartPhone extends Phone implements Camera,MusicPlayer{
	
	public void click() {
		System.out.println("Clicking");
	}
	public void record() {
		System.out.println("Recording");
	}
	public void play() {
		System.out.println("Playing");
	}
	public void pause() {
		System.out.println("Paused");
	}
	public void stop() {
		System.out.println("Stopped");
	}
}
public class Interface2 {

	public static void main(String[] args) {
		SmartPhone s=new SmartPhone();
		s.record();

	}

}
