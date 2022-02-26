package programs;

public class ConditionalStatement2 {

	public static void main(String[] args) {
		int a=5,b=10,c=15;
		
		// Nested if
		
		if(a>b && a>c)
		{
			System.out.println("a is greatest");
		}
		else
		{
			if(b>c)
			{
				System.out.println("b is greatest");
				
			}
			else
			{
				System.out.println("c is greatest");
			}
		} 
		
		// else if
		
	/*	if(a>b && a>c)
		{
			System.out.println("a is greatest");
		}
		else if(b>c)
		{
			System.out.println("b is greatest");
				
		}
		else
		{
			System.out.println("c is greatest");
		}  */
	

	}

}
