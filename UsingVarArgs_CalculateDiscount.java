package programs;

public class UsingVarArgs_CalculateDiscount {
	static double discount(double...d) {
		double sum=0;
		double tot=0;
		double d1;
		for(int i=0;i<d.length;i++) {
			sum=sum+d[i];
		}
		
		if(sum>0 && sum<500) {
			d1=(15d/100d)*sum;
			tot =sum-d1;
			
			
		}
		else if(sum>500 && sum<1000) {
			d1=(25d/100d)*sum;
			tot =sum-d1;
		
			
		}
		else if(sum>1000 && sum<1500) {
		    d1=(50d/100d)*sum;
			tot =sum-d1;
			
			
		}
		
		return tot;
		
	}

	public static void main(String[] args) {
		System.out.println(discount());
		System.out.println(discount(100.0));
		System.out.println(discount(100.0,150.0));
		System.out.println(discount(100.0,150.0,120.0));

	}

}
