package programs;
class Coffee{
	private int milk;
	private int sugar;
	static private Coffee our=null;
	private Coffee() {
		milk=1;
		sugar=1;
	}
	static public Coffee getInstance() {
		if(our==null) 
			our=new Coffee();
		
		return our;
	}
}
public class SingletonClass1 {

	public static void main(String[] args) {
		Coffee c=Coffee.getInstance();
		Coffee c1=Coffee.getInstance();
		System.out.println(c+" "+c1);  // Refering to the same object.

	}

}
