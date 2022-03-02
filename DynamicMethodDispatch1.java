package programs;
class A1{
	int x=10;            //variables are not polymorphic in java.Hence , in the inheritance , the value of the reference is used instead of object type.
}
class B1 extends A1{
	int x=90;
	
}
public class DynamicMethodDispatch1 {

	public static void main(String[] args) {
		A1 obj=new B1();
		System.out.println(obj.x);

	}

}
