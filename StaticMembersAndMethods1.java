package programs;

class Tests {
	static int a=10;
	int b=20;
	static void meth1() {
		System.out.println(a);
		
	}
	static void meth1(int a) {  // We can OVERLOAD the static methods
		System.out.println(a);  //We cannot override the static methods 
		
	}
	
	void meth2() {
		System.out.println(a+" "+b);
		
	}
}

public class StaticMembersAndMethods1{
	public static void main(String[] args) {
		//Tests.meth1();  ---> Can be accessed with the class name
		Tests s1=new Tests();
		Tests s2=new Tests();
		s2.a=50;
		
		s1.meth2();   // The modified static value will be same for all the objects
		s2.meth2();
		

	}

}
