package programs;
class Store {
	Member mem[]=new Member[100];
	int count=0;
	void register(Member m) {
		mem[count++]=m;
	}
	void inviteSale() {
		for(int i=0;i<mem.length;i++) {
			//System.out.println(mem[i]);
			mem[i].callback();
		}
	}
}
interface Member{
	void callback();
}
class Customerr implements Member{
	String name;
	Customerr(String n){
		name=n;
	}
	public void callback() {
		System.out.println("I will visit the store "+name);
	}
}
public class UsingInterface_Store {

	public static void main(String[] args) {
		Store s=new Store();
		Customerr c1=new Customerr("John");
		Customerr c2=new Customerr("Paul");
		s.register(c1);
		s.register(c2);
		s.inviteSale();

	}

}
