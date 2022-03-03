package programs;

// Local inner class can be abstract. 



class OuterTest   
{ 
    public void getValue() 
    { 
       int num = 40; 
 
        // Abstract Local inner Class
        abstract class AbstractInnerTest 
        { 
 
            abstract void getRemainder();
 
        } 
 
        class InnerTest extends AbstractInnerTest
        { 
            public int divisor; 
            public int remainder; 
 
            public void getRemainder()
            { 
                divisor = 3; 
                remainder = num%divisor; 
                System.out.println("Remainder : " + remainder); 
            } 
 
        } 
        InnerTest innerTest = new InnerTest();  
        innerTest.getRemainder();
    } 
 
} 
 
public class LocalInnerClass3
{
	public static void main(String[] args) {
		OuterTest outerTest = new OuterTest(); 
        outerTest.getValue(); 
	}
}