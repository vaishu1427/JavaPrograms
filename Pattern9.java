package programs;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a;j++) {
				if(j>=i){
					System.out.print("* ");
				}
				else { 
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
