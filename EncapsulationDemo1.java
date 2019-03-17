package OOPS;
import java.util.*;
class Student
{
	//public int marks1=60;
	//public int marks2=55;
	//public int marks3=90;
	public void add(int marks1,int marks2,int marks3)
	{
		int mk;
		mk=marks1+marks2+marks3;
		System.out.println(mk);
	}
}
public class EncapsulationDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER MARKS1");
		int marks1=sc.nextInt();
		System.out.println("ENTER MARKS2");
		int marks2=sc.nextInt();
		System.out.println("ENTER MARKS3");
		int marks3=sc.nextInt();
      Student sd=new Student();//creation of an Object
      sd.add(marks1,marks2,marks3);
      
	}

}
