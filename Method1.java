package programs;

public class Method1 {
	int max(int x,int y) {   //Either we can give as STATIC or we can create object for the class
		if(x>y) {
			return x;
		}
		else {
			return y;
		}

	}

	public static void main(String[] args) {
		int a=10,b=15;
		Method1 mp=new Method1();
		System.out.println(mp.max(a,b));  // like max(a,b)

	}

}
