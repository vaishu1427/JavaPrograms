package programs;

import java.util.Scanner;
class Person{
    public String name;
    /*public Person(String n){
        name=n;
    }*/
}
class Staff extends Person{
    public  int staffId;
    /*public Staff(String s){
        staffId=s;
    }*/
}
class TemporaryStaff extends Staff{
    public int days;
    public int hours;
    public TemporaryStaff(String name,int staffId,int d1,int d2){
        this.name=name;
        this.staffId=staffId;
        days=d1;
        hours=d2;
    }
    public void display(){
        System.out.println("No. of Days : "+days);
        System.out.println("No. of Hours Worked : "+hours);
        System.out.println("Total Salary : "+(days*hours*50));
    }
}
class Inheritance2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a1=sc.nextLine();
        int a2=sc.nextInt();
        int a3=sc.nextInt();
        int a4=sc.nextInt();
        //Person p=new Person(a1);
        //Staff s=new Staff(a2);
        TemporaryStaff t=new TemporaryStaff(a1,a2,a3,a4);
        System.out.println("Name : "+a1);
        System.out.println("Staff Id : "+a2);
        t.display();
        
        //TemporaryStaff t=new TemporaryStaff(a1,a2,a3,a4);
    }
}// You are using Java
