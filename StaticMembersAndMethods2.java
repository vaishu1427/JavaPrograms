package programs;
class Test{
	static int price=10;
	int a=20;
	static int onRoadPrice(String city) {
		int p=0;
		switch(city) {
		
			case "Delhi":
				return p=price+price;
			
		
			case "Mumbai":
				return p=price *price;
			
		}
		return p;
	}
}
public class StaticMembersAndMethods2 {

	public static void main(String[] args) {
		Test t=new Test();
		System.out.println(Test.onRoadPrice("Mumbai"));

	}

}
