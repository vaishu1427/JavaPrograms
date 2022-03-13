package programs;
class ThreadTest1 extends Thread{
	public void run() {
		int i=1;
		while(true) {
			System.out.println(i+" Thread");
			i++;
		}
	}
}
public class MultiThreading1 {

	public static void main(String[] args) {
		ThreadTest1 t=new ThreadTest1();
		t.start();
		int i=1;
		while(true) {
			System.out.println(i+" Main");
			i++;
		}
	}

}
