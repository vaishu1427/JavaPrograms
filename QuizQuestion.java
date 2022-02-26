package programs;
class box{
	int length;
	int width;
	int height;
	int v;
	void volume(int height,int length,int width) {
		v=height*length*width;
		
	}
}

public class QuizQuestion {

	public static void main(String[] args) {
		box b=new box();
		b.length=1;
		b.width=2;
		b.height=3;
		b.volume(2,4,6);
		System.out.println(b.v);
	}

}
