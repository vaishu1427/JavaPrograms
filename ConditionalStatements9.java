package programs;

public class ConditionalStatements9 {

	public static void main(String[] args) {
		
		// To find out the protocol and type of website
		
		
		String s="ftp://www.google.org";
		int a=s.indexOf(':');
        String sub1=s.substring(0,a);
        if(sub1.equals("http"))
        {
        	System.out.println("It is Hyper Text Transfer Protocol");
        }
        else if(sub1.equals("ftp"))
        {
        	System.out.println("It is File Transfer Protocol");
        }
        else 
        {
        	System.out.println("Other than http and ftp");
        
        }
        int b=s.lastIndexOf('.');
        String sub2=s.substring(b+1);
        if(sub2.equals("com"))
        {
        	System.out.println("It is Commercial website");
        }
        else if(sub2.equals("org"))
        {
        	System.out.println("It is Organization website ");
        }
        else if(sub2.equals("net"))
        {
        	System.out.println("It is Network website ");
        }
        else 
        {
        	System.out.println("Other than com , org , net .");
        
        }
	}

}
