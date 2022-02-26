package programs;

class Studentt{
	public int roll;
	public String name;
	public String course;
	public int m1 =50,m2=80,m3=90;
	
	public int total() {
		return m1+m2+m3;
	}
	public int average() {
		return total()/3;
	}
	public String toString() {
		if(average()>=60) {
			return "A";
		}
		else if(average()<60) {
			return "B";
		}
	    return "";    //java needs a else block or return outside the if else if ladder 
	
	}
	
}

public class UsingClassAndObjects_Student {

	public static void main(String[] args) {
		
		Student s=new Student();
		s.roll=172;
		s.name="Vaishnavi";
		s.course="Maths";
		System.out.println("Roll number  "+s.roll);
		System.out.println("Name  "+s.name);
		System.out.println("Course  "+s.course);
		System.out.println("Total "+s.total());
		System.out.println("Average "+s.average());
		System.out.println(s);

	}

}
