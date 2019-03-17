package OOPS;
class Parent
{
	int a=25;
}
class Child extends Parent
{
	int b=60;
	public void add()
	{
		int c;
		c=a+b;
		System.out.println("THE RESULT IS:"+c);
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Child ch=new Child();
      ch.add();
	}

}
