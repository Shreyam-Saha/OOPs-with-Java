package OOPS;
class Outer
{
	int out_x=60;
	class Inner
	{
		int inn_y=120;
		public void add()
		{
			int c=out_x+inn_y;
			 System.out.println("THE RESULT IS:"+c);
		}
	}
}
public class OuterInnerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer out=new Outer();
		Outer.Inner inn=out.new Inner();
		inn.add();

	}

}
