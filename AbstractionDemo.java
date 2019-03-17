package OOPS;
abstract class Shape
{
	abstract void area(double r);
}
class Square extends Shape
{
	void area(double r)
	{
		System.out.println("THE AREA OF SQUARE IS:"+(r*r));
	}
}
class Circle extends Shape
{
	void area(double r)
	{
		System.out.println("THE AREA OF CIRCLE IS:"+(Math.PI*r*r));
	}
}
class Triangle extends Shape
{
	void area(double r)
	{
		System.out.println("THE AREA OF TRIANGLE IS:"+(0.5*r*r));
	}
}
public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq=new Square();
		Circle cr=new Circle();
		Triangle tr=new Triangle();
		sq.area(5.0);
		cr.area(5.0);
		tr.area(5.0);

	}

}
