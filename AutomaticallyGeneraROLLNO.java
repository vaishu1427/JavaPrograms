package programs;
import java.util.*;

// Here the class is generating automatically the rollno without passing the parameter to the object
// And this done using the STATIC VARIABLES


class Teacher{
	private static int count=1;
	
	private String rollNoGenerator() {
		Date d=new Date();
		String s="univ"+"-"+(d.getYear()+1900)+"-"+count;
		count++;
		return s;
	}
	public Teacher() {
		System.out.println(rollNoGenerator());
	}
}
class Customers{
	private int customerid;
	private static int count1=171;
	private String custIDgen() {
		String s1="19cs"+""+count1;
		count1++;
		return s1;
	}
	public Customers() {
		System.out.println(custIDgen());
	}
}
public class AutomaticallyGeneraROLLNO {

	public static void main(String[] args) {
		Teacher t1=new Teacher();
		Teacher t2=new Teacher();
		Teacher t3=new Teacher();
		Teacher t4=new Teacher();
         
		
		Customers c1=new Customers();
		Customers c2=new Customers();
		Customers c3=new Customers();
		Customers c4=new Customers();
		
	}

}
