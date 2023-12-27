class triangle
{
	int side = 3;
	int base = 4;
	int side1 = 5;
	
	public void area_triangle()
	{
		System.out.println("Area of triangle is : " + (side * base * 1/2));
	}
	public void perimeter_triangle()
	{
		System.out.println("Peri-Meter of triagnle : " + (side + base + side1));
	}

}
public class O27 {
	
	public static void main(String[] args) 
	{
		
		triangle tr = new triangle();
		tr.area_triangle();
		tr.perimeter_triangle();
		
		
		
	}

}
