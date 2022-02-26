package programs;
class Subtraction{
	private int num1;
	private int num2;
	
	// PROPERTY METHODS
	
	public int getNum1(){
		return num1;
	}
	public void  setNum1(int l) {
		num1=l;
		
	}
	public int getNum2(){
		return num2;
	}
	public void  setNum2(int m) {
		num2=m;
		
	}
	
	// CONSTRUCTOR
	
	public Subtraction(int m,int n) {
	    setNum1(m);
		setNum2(n);
	}
	
	//INSTANCE METHOD OR FACILITATORS 
	
	public int sub() {
		return num1-num2;
	}
	
	//NOTE: Method starting with is(eg: isSquare()) called as enquire method
		
}
public class Constructors2 {

	public static void main(String[] args) {
		Subtraction s=new Subtraction(10,5);
		
		System.out.println(s.sub());

	}

}
