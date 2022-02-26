package programs;
class Trial{
	int a=10;  // If the line is like static int a=10;   The ans will be 10 , 11
	void printing() {
		System.out.println(a);
		a++;
	}
}
public class StaticAndNormalVariable {

	public static void main(String[] args) {
		Trial t=new Trial();
		Trial t1=new Trial();
		t.printing();
		t1.printing();

	}

}
