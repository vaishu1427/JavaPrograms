package programs;
class Local{
	void innerClass() {  //Outside this method this class is not visible
		class Inner{
			void  display() {
				System.out.println("Hello");
			}
		}
		
			Inner i=new Inner();
			i.display();
	}
}
public class LocalInnerClass1 {

	public static void main(String[] args) {
		Local l=new Local();
		//Local.Inner li=new Local().new Inner();
		l.innerClass();
		

	}

}
