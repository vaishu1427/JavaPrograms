package programs;

public class ConditionalStatementSwitchCase4 {

	public static void main(String[] args) {
		String s="google.gov";
		int index=s.indexOf('.');
		String sub=s.substring(index+1);
		switch(sub)
		{
		case "com": System.out.println("Commercial");
		break;
		case "org": System.out.println("Organisation");
		break;
		case "net": System.out.println("Network");
		break;
		case "gov": System.out.println("Government");
		break;
		default:System.out.println("Some other type of website");
		break;
		}
		

	}

}
