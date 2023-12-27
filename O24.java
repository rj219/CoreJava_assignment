class Parent
{
	public void toPrint()
	{
		System.out.println("---This is parent class---");
	}
}
class Child extends Parent
{
	public void toDisplay()
	{
		System.out.println("---This is child class---");
	}
}
public class O24 {

		public static void main(String[] args)
		{
			Parent pr = new Parent();
			pr.toPrint();
			
			Child cr = new Child();
			cr.toDisplay();
			cr.toPrint();
			cr.toDisplay();
		}
	
}
