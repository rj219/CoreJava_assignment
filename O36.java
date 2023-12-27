abstract class Shape
{
	public abstract void Rectanglearea(double length, double width);
	
	public abstract void Squarearea(double side);
	
	public abstract void Circlearea(double radius);
}

class Area1 extends Shape
{
	public void Rectanglearea(double length , double width)
	{
		System.out.println("The area of rectangle is : " + length * width);
	}
	public  void Squarearea(double side)
	{
		System.out.println("The area of square is : " + side * side );
	}
	public  void Circlearea(double radius)
	{
		System.out.println("The are of a circle is : " + 2 * 3.14 * radius);
	}
	
}
public class O36 {
	
	public static void main(String[] args) {
		
		Area1 area = new Area1();
		
		area.Rectanglearea(5, 4);
		area.Squarearea(5);
		area.Circlearea(5);
		
	}

}
