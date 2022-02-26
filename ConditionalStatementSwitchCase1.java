package programs;

public class ConditionalStatementSwitchCase1 {

	public static void main(String[] args) {
		int a=1;  // Should not give it as float,double. We can give byte,short,int,char,String. eg.case 1,case "File" etc
		switch(a) // Should give the break statement for each . Otherwise it prints all the statements upto the statement which has break.
		{
		case 1:System.out.println("One");
		break;
		case 2:System.out.println("Two");
		break;
		case 3:System.out.println("Three");
		break;
		default:System.out.println("Invalid number");
		break;
		
		}

	}

}
