class Rectangle
{
	int length;
	int breadth;
	Rectangle(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;	
	}
	public void print_area()
	{
		System.out.println("Area of the rectangle is : "+ length*breadth);
	}
	public void print_perimeter()
	{
		System.out.println("Peri-meter of the rectangle is : "+2+(length*breadth));
	}
}

class Square extends Rectangle
{

	Square(int length)
	{
		super(length, length);
	}
	
	public void Sqperi()
	{
		System.out.println("Peri-meter of the square is : " + 4*length);
	}
	
}
public class O26 {
	
	public static void main(String[] args) 
	{
		Rectangle rec = new Rectangle(4,5);
		rec.print_area();
		rec.print_perimeter();
		
		Square sq = new Square(4);
		sq.Sqperi();
		sq.print_area();
		
		
		
	}

}
