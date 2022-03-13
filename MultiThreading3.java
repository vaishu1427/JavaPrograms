package programs;
class ThreadTest2 implements Runnable{
	public void run() {
		int i=1;
		while(true) {
			System.out.println(i+" Thread");
			i++;
		}
	}
	
}
public class MultiThreading3 {

	public static void main(String[] args) {
		ThreadTest2 th=new ThreadTest2();
		Thread t=new Thread(th);
		t.start();
		int i=1;
		while(true) {
			System.out.println(i+" Main");
			i++;
		}

	}

}
