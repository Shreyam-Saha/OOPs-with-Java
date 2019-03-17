package OOPS;
class UseStatic
{
	public static int x=25;
	public static void show_x()
	{
		System.out.println("THE VALUE OF X IS:"+x);
	}
}
public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseStatic.show_x();
		System.out.println(UseStatic.x);

	}

}
