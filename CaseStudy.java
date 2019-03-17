package OOPS;
class Percel
{
	class Contents
	{
		public double weight(double w)
		{
			return w;
		}
	}
	class Destination
	{
		public void desti(String label)
		{
			System.out.println(label);
		}
	}
}
public class CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Percel pr=new Percel();
		Percel.Contents con=pr.new Contents();
		Percel.Destination ds=pr.new Destination();
		double wg=con.weight(150.00);
		System.out.println("THE WEIGHT IS:"+wg);
		ds.desti("KOLKATA");

	}

}
