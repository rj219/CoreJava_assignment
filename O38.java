class Sha_pe
{
	public void toPrint()
	{
		System.out.println("This is Shape");
	}
}
class Circle extends Sha_pe
{
	public void toPrint()
	{
		System.out.println("This is Circular shape");
	}
}
class Rect_angle extends Sha_pe
{
	public void toPrint()
	{
		System.out.println("This is Rectangle Shape");
	}
}
class Squ_are extends Rect_angle
{
	public void toPrint()
	{
		System.out.println("Square is Rectangle");
	}
}

public class O38 {

	
	public static void main(String[] args) {
		
		Sha_pe sp = new Squ_are();
		
		sp.toPrint();
		
		Rect_angle re = new Squ_are();
		
		re.toPrint();
	}
}
