package OOPS;
class Employee
{
	public int eid=1;
	public String ename="ARUP";
	public void show()
	{
		System.out.println("THE ID IS:"+eid);
		System.out.println("THE NAME IS:"+ename);
	}
}
class PersonalDetails extends Employee
{
	String plotno="AD41";
	String streetnm="PARK STREET";
	String pincode="700078";
	public void display()
	{
		System.out.println("THE PLOTNO IS:"+plotno);
		System.out.println("THE STREET NAME IS:"+streetnm);
		System.out.println("THE PINCODE IS:"+pincode);
	}
}
class Salary extends PersonalDetails
{
	double basic=25000.00;
	double da=2500.00;
	double hra=3000.00;
	public void totalsal()
	{
		double total;
		total=basic+da+hra;
		System.out.println("THE TOTAL SALARY IS:"+total);
	}
	
}
public class MultiLevelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary sl=new Salary();
		sl.show();
		sl.display();
		sl.totalsal();

	}

}
