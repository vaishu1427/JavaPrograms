package programs;
class Subjects{
	private String subid;
	private String name;
	private int maxmark;
	private int markobtained;
	
	//get
	
	public String getSubid() {
		return subid;
	}
	public String getName() {
		return name;
	}
	public int getmaxmark() {
		return maxmark;
	}
	public int getmarkobtained() {
		return markobtained;
	}
	
	//set
	
	 public void setMaxmarks(int maxmarks) {
		 maxmark=maxmarks;
	 }
	 public void setMarksobtain(int marksob) {
		 markobtained=marksob;
	 }
	//constructor
	
	 public Subjects(String id,String nam) {
		 subid=id;
		 name=nam;
	 }
	 public Subjects(String id,String nam,int maxmark,int markobtained) {
		 subid=id;
		 name=nam;
		 this.maxmark=maxmark;
		 this.markobtained=markobtained;
	 }
	 
	 //method
	 
	 public String toString() {
		 return "\nSubjectid: "+subid+"\nName: "+name+"\nmaxmarks: "+maxmark+"\nmarkobtained: "+markobtained;
	 }
	

}
public class UsingConstructor_Subjects {

	public static void main(String[] args) {
		Subjects s1=new Subjects("43gs6","Vaishnavi.S");
		Subjects s2=new Subjects("43s6","Vaish",98,309);
		
		//System.out.println(s2.getmaxmark());
		
		
		// Creating the array of objects
		
		Subjects s[]=new Subjects[3];
		s[0]= new Subjects("123d","ammu",100,0);
		s[1]= new Subjects("145f","senth",200,0);
		s[2]= new Subjects("176y","seno",800,0);
		
		for(Subjects st:s) {
			System.out.println(st);  // Automatically the println() method will call the toString method 
		}
		

	}

}
