package programs;

public class WideningNarrowing {

	public static void main(String[] args) {
		byte b=5;
		short s=10;
		int i=15;
		long l=20l;
		float f=10.7f;
		double d=12.6;
		char c;
		boolean bl=true; 
		
		b=b;
		b=s;
		b=i;
		b=l;
		b=f;
		b=c;
		
		s=b;
		s=s;
		s=i;
		s=l;
		s=f;
		s=d;
		s=c;
		
		i=b;
		i=s;
		i=i;
		i=l;
		i=f;
		i=d;
		i=c;
		
		l=b;
		l=s;
		l=i;
		l=l;
		l=f;
		l=d;
		l=c;
		
		f=b;
		f=s;
		f=i;
		f=l;  /* doubt */
		f=f;
		f=d;
		f=c;
		
		d=b;
		d=s;
		d=i;
		d=l;
		d=f;
		d=d;
		d=c;
		
		c=b;
		c=s;
		c=i;
		c=l;
		c=f;
		c=d;
		c=c;
		
	}

}
