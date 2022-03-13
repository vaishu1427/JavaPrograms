package programs;

public class MultiThreading4 implements Runnable{
	public void run() {
		int i=1;
		while(true) {
			System.out.println(i+" Thread");
			i++;
		}
	}
	
	public static void main(String[] args) {
		MultiThreading4 m=new MultiThreading4();
		Thread t=new Thread(m);
		t.start();
		int i=1;
		while(true) {
			System.out.println(i+" Main");
			i++;
		}

	}

}
