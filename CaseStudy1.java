package OOPS;
class Student1
{
	public int rollno;
	public String sname;
	public Student1(int rollno,String sname)//Constructor
	{
		this.rollno=rollno;//this invoke current object
		this.sname=sname;
	}
	public void show()
	{
		System.out.println("ROLLNO IS:"+rollno);
		System.out.println("NAME IS:"+sname);
	}
}
class Marks1 extends Student1
{
	String sub1;
	String sub2;
	String sub3;
	public Marks1(int rollno,String sname,String sub1,String sub2,String sub3)
	{
		super(rollno,sname);//calling super class constructor
		this.sub1=sub1;
		this.sub2=sub2;
		 this.sub3=sub3;
	}
	public int score(int p,int r,int q)
	{
		return(p+r+q);
	}
	public void display()
	{
		System.out.println("THE SUBJECT1 IS:"+sub1);
		System.out.println("THE SUBJECT1 IS:"+sub2);
		System.out.println("THE SUBJECT1 IS:"+sub3);
	}
}
class Result extends Marks1 implements Sports
{
	public Result(int rollno,String sname,String sub1,String sub2,String sub3)
	{
		super(rollno,sname,sub1,sub2,sub3);
	}
	public int credit(int c)
	{
		return c;
	}
}
public class CaseStudy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Result r=new Result(1,"ANUP","PHYS","CHEM","MATHS");
       int total= r.score(70,80,90);
       int cr=r.credit(25);
       int res=total+cr;
       r.show();
       r.display();
       System.out.println("FINAL MARKS IS:"+res);
	}

}
