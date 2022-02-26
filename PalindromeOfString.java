package programs;

public class PalindromeOfString {

	public static boolean isPalindrome(String str) {
        String temp=str;
        String actual="";
        boolean n=false;
		for(int i=str.length()-1;i>=0;i--){
            actual=actual+str.charAt(i);
        }
        
        if(actual.equals(temp)){
            n=true;
            //return n;
        }
        else{
            n=false;
    		//return n;
        }
    return n;
	}
    public static void main(String[] args){
        //Scanner sc=new Scanner(System.in);
        //String s=sc.next();
        String s="malayalam";
        System.out.println(isPalindrome(s));
    }

}
