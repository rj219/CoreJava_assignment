abstract class Marks
{
	public abstract void getPercentage();
}
class A extends Marks
{
	int maths;
	int sci;
	int eng;
	
	A(int maths, int sci, int eng)
	{
		this.maths = maths;
		this.sci = sci;
		this.eng = eng;
	}
	public void getPercentage()
	{
		int total  = maths + sci + eng;
		
		double avg = total *100 / 300;
		
		System.out.println(avg);	
	}
}
class B extends Marks
{
	int guj;
	int ss;
	int physics; 
	int chem;
	B(int guj, int ss, int physics, int chem)
	{
		this.guj = guj;
		this.ss = ss;
		this.physics = physics;
		this.chem =chem;
	}
	public void getPercentage()
	{
		int total = guj + ss + physics + chem;
		
		double avg = total / 4;
		
		System.out.println(avg);
	}
}
public class O34 {
	
	public static void main(String[] args) 
	{
		A a = new A(76, 79, 67);
		a.getPercentage();
		
		B b = new B(78, 98, 78, 54);
		b.getPercentage();
	}
}
