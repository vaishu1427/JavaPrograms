package programs;
import java.util.Scanner;
class OverflowException extends Exception{
	public String toString() {
		return "Stack has overflown";
	}
}
class UnderFlowException extends Exception{
	public String toString() {
		return "Stack has underflown";
	}
}
class Stack{
		Scanner sc=new Scanner(System.in);
	
		
		int top=-1;
		void overflow(int x,int a[]) throws OverflowException{
			if(a.length-1==top) {
				throw new OverflowException();
			}
			else {
				a[++top]=x;
			}
		}
		void underflow(int y,int a[]) throws UnderFlowException{
			if(top==-1) {
				throw new UnderFlowException();
			}
			int f=a[top];
			a[top]=0;
			--top;
		}
	
}
public class ExceptionStackOverflow_UnderFlow {
	
	public static void main(String[] args) {
		int a[]=new int[4];
		Stack s=new Stack();
		try {
		
		s.overflow(10,a);
		s.overflow(10,a);
		s.overflow(10,a);
		s.overflow(10,a);
		//s.overflow(10,a);
		s.underflow(10,a);
		}
		catch(UnderFlowException e) {
			System.out.println(e);
		}
		catch(OverflowException e ) {
			System.out.println(e);
		}
		finally {
			for(int i:a) {
				System.out.println(i);
			}
		}
		
	}

}
