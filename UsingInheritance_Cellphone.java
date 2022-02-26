package programs;
import java.util.Scanner;

class CellPhone{
	private String phoneno;
	private String imie;
	
	// get
	
	public String getPhoneno() {
		return phoneno;
	}
	public String getImie() {
		return imie;
	}
	
	// set
	
	public void setPhoneno(String phoneno) {
		this.phoneno=phoneno;
	}
	public void setImie(String imie) {
		this.imie=imie;
	}
	
	// Methods
	
	public void call() {
		Scanner sc=UsingInheritance_Cellphone.sc;
		System.out.println("Enter a phone number :");
		String no=sc.next();
		System.out.println("You are calling to this number "+no);
		System.out.println();
		UsingInheritance_Cellphone.main(null);
	}
	public void sms() {
		Scanner sc=UsingInheritance_Cellphone.sc;
		System.out.println("Enter a phone number :");
		String no=sc.next();
		System.out.println("Your message has sent to this number "+no);
		System.out.println();
		UsingInheritance_Cellphone.main(null);
	}
	public void savecontact() {
		Scanner sc=UsingInheritance_Cellphone.sc;
		System.out.println("Enter a phone number :");
		String no=sc.next();
		System.out.println("Enter a name to save:");
		String nameofperson=sc.next();
		System.out.println("You have saved this number "+no+" as the name "+nameofperson);
		System.out.println();
		UsingInheritance_Cellphone.main(null);
	}
}
class SmartPhone extends CellPhone{
	private String mac;
	
	//get
	
	public String getMac() {
		return mac;
	}
	
	// set
	
	public void setMac(String mac) {
		this.mac=mac;
	}
	
	//method
	
	public  void play() {
		System.out.println("You have played the music ");
	}
	
}
public class UsingInheritance_Cellphone {
	static Scanner sc=new Scanner(System.in);
    static CellPhone c=new CellPhone();
	public static void main(String[] args) {
		System.out.println("1. call\n"+"2. sms\n"+"3. savecontact\n"+"4. Exit\n");
		System.out.println("Choose an option");
		int num=sc.nextInt();
		
		switch(num) {
		case 1:
			c.call();
			break;
		case 2:
			c.sms();
			break;
		case 3:
			c.savecontact();
			break;
		case 4:
			System.exit(0);
			break;

		}
	}

}
