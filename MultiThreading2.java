package programs;

public class MultiThreading2 extends Thread{
	public void run() {
		int i=1;
		while(true) {
			System.out.println(i+" Thread");
			i++;
		}
	}
	public static void main(String[] args) {
		MultiThreading2 m=new MultiThreading2();
		m.start();
		int i=1;
		while(true) {
			System.out.println(i+" Main");
			i++;
		}

	}

}
