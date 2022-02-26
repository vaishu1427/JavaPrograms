package programs;

class Addition{
	private int a;
	private int b;
	
	public int getA() {
		return a;
	}
	public void setA(int num1) {
		a=num1;
	}
	public int getB() {
		return b;
	}
	public void setB(int num2) {
		b=num2;
	}
	
	public Addition(int l,int m) { // Non parameterized constructor
		setA(l);
		setB(m);
	}

	public int add() {
		return a+b;
	}
	
}

public class Constructors1 {

	public static void main(String[] args) {
		Addition a1=new Addition(10,20);  
		//a1.setA(10);
		//a1.setB(10);
		System.out.println(a1.add());

	}

}
