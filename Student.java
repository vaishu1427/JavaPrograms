package programs;
class Student{
 
private int roll;
 
private String name;
 
private String department;
 
private Subject subjects[];
 
 
Student(){ 
 
roll =1;
name="xyz";
department="Comps";
 
subjects= new Subject[3]; //Creation of Array of Objects
 
subjects[0]= new Subject("S001","Physics",100);
 
subjects[1]= new Subject("S002","Chemistry",100);
 
subjects[2]= new Subject("S003","Mathematics",100);
    
}
 
 
 
 
Student(int roll ,String name, String department ){ 
 
 
this.roll=roll;
this.name=name;
this.department=department;
 
subjects= new Subject[3]; //Creation of Array of Objects
 
subjects[0]= new Subject("S001","Physics",100,0);
 
subjects[1]= new Subject("S002","Chemistry",100,0);
 
subjects[2]= new Subject("S003","Mathematics",100,0);
    
}
 
 
Student(int roll ,String name, String department , Subject subjects[] ){ 
 
this.roll=roll;
this.name=name;
this.department=department;
this.subjects=subjects;
    
}
 
public String toString()
 
{
 
String ans= "roll number :"+roll+"\n name: "+name+"\n department:"+department+"\n";
for(Subject s:subjects){
    ans+=s+"\n";
}
 
return ans;
 
}
 
 
public int getRoll() {
 
return roll;
 
}
 
public void setRoll(int roll) {
 
this.roll = roll;
 
}
 
public String getName() {
 
return name;
 
}
 
public void setName(String name) {
 
this.name = name;
 
}
 
public String getDepartment() {
 
return department;
 
}
 
public void setDepartment(String department) {
 
this.department = department;
 
}
 
public Subject[] getSubjects()
 
{
 
return subjects;
 
}
 
public void setSubjects(Subject subjects[])
 
{
 
this.subjects=subjects;
 
}
 
 
 
}
 
 
 
public class Main {
 
 
 
public static void main(String[] args) {
 
Subject subjects[] = new Subject[3]; //Creation of Array of Objects
 
subjects[0]= new Subject("S004","Physics-2",100,20);
 
subjects[1]= new Subject("S005","Chemistry-2",200,90);
 
subjects[2]= new Subject("S006","Mathematics-2",100,11);
 
 
 
 
Student s1=new Student();
System.out.println(s1);
 
Student s2=new Student(102,"Raj","Mechanical",subjects);
System.out.println(s2);
 
 
 
}


 
 
 
 
 
 
}
