package programs;

public class MethodOverloading1 {
	static int max(int x,int y) {
		return x>y?x:y;
	}
	static int max(int x,int y,int z) {
		if(x>y&&x>z) {
			return x;
		}
		else if(y>z) {
			return y;
		}
		else {
			return z;
		}
	}
    static float max(float x,float y) {
    	return x>y?x:y;
    }
	
    static double max(double x,double y) {
    	return x>y?x:y;
    }
	public static void main(String[] args) {
		
		System.out.println(max(10,200,30));

	}
	

}
