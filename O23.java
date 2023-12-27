class Area
{
	public void Area_square_rectangle(int a)
	{
		System.out.println(a*a);
	}
	public void Area_square_rectangle(int length, int breadth)
	{
		System.out.println(length * breadth);
	}
}
public class O23 {
	
	public static void main(String[] args) {
		
		Area ar = new Area();
		
		ar.Area_square_rectangle(5);
		ar.Area_square_rectangle(5, 8);
		
	}

}
