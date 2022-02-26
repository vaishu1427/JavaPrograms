package programs;
import java.util.Scanner;
class Account{
	private String accno;
	private String name;
	private String address;
	private String phoneno;
	private String Dob;
	protected double balance;
	
	public String getAccno() {
		return accno;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public String getDob() {
		return Dob;
	}
	public double getBalance() {
		return balance;
	}
	
	
	public void setAddress(String acc) {
		accno=acc;
	}
	public void setPhoneno(String no) {
		phoneno=no;
	}
	public void setDob(String dob) {
		Dob=dob;
	}
}

class SavingsAcc extends Account{
	Scanner sc=UsingInheritance_Account.sc;
	
	public void deposit() {
		System.out.println("Enter the amount to deposit:");
		double amount1=sc.nextDouble();
		balance= balance + amount1;
	
		System.out.println("Balance : "+balance);
		System.out.println();
		UsingInheritance_Account.main(null);
		
	}
	
	public void withdraw() {
		System.out.println("Enter the amount to withdraw:");
	    double amount2=sc.nextDouble();
		balance=balance-amount2;
		System.out.println(balance);
		System.out.println();
		UsingInheritance_Account.main(null);
		
		
	}
	
}
/*class LoanAcc extends Account{
	public double loanac(int num) {
		
	}
	
}*/

public class UsingInheritance_Account {
	 static Scanner sc=new Scanner(System.in); 
	 static SavingsAcc save=new SavingsAcc();
		
		public static void main(String[] args) {
		//LoanAcc loan=new LoanAcc();

		System.out.println("Choose any option below");
	    System.out.print("1 .  Deposit \n"+"2 .  Withdraw\n"+"3 .  Exit\n");
	    int num=sc.nextInt();
		switch(num) {
			case 1:
				save.deposit();					
				break;
			case 2:
				save.withdraw();			
				break;
			case 3:
				System.exit(0);
				break;
		}
		sc.close();
	}    
}
