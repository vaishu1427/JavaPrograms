package programs;
class Out{
	void display() {
		class In{
			void show() {
				System.out.println("Hai");
			}
		}
		new In().show();  //  <---- Another way (anonymous object)
	}
	
}
public class LocalInnerClass2 {

	public static void main(String[] args) {
		Out o=new Out();
		o.display();

	}

}
