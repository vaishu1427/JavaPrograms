package programs;

class Students{
	private String rolno;
	private String name;
	private String dept;
	private Subjects subjects[];
	
	// get
	
	public String getRolno() {
		return rolno;
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public Subjects[] getSubjects() {
		return subjects;
	}
	
	//set
	

	public void setDept(String dept) {
		this.dept=dept;
	}
	public void setSubjects(String...sub){
		for(String[] s:sub) {
			Subjects[]=s;
		}
		
	}
	
	//constructor
	
	/*public Students(String rollno,String name,String dept,String subjects) {
		
	}*/

	
}

public class UsingConstructor_Students {

	public static void main(String[] args) {
		Subjects subjects[] = new Subjects[3]; //Creation of Array of Objects
		 
		subjects[0]= new Subjects("S004","Physics-2",100,20);
		 
		subjects[1]= new Subjects("S005","Chemistry-2",200,90);
		 
		subjects[2]= new Subjects("S006","Mathematics-2",100,11);
		 
	}

}
