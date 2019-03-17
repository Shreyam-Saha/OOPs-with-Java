package OOPS;
final class Parent12
{
	public final void display()
	{
		System.out.println("I AM IN PARENT CLASS");
	}
}
class Child12 extends Parent12
{
	public void display()
	{
		System.out.println("I AM IN CHILD CLASS");
	}
}
public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child12 ch12=new Child12();
		  ch12.display();

	}

}
