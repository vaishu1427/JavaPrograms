package programs;
class Add{
	private int num1;
	private int num2;
	public int getNum1() {
		return num1;
	}
    public int getNum2() {
		return num2;
	}
	public void setNum1(int n) {
		num1=n;
	}
	public void setNum2(int m) {
		num2=m;
	}
	public int Addd() {
		return getNum1()+getNum2(); //return num1+num2;
	}
}

public class UsingPropertyMeth_Add2Nums {

	public static void main(String[] args) {
		Add d=new Add();
		d.setNum1(10);
		d.setNum2(4);
		System.out.println(d.Addd());

	}

}
