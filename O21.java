class PrintNumber
{
	public int printn(int num)
	{
		System.out.println(num);
		return num;
		
	}
	
	public float printn(float num)
	{
		System.out.println(num);
		return num;
	}
	
	public double printn(double num)
	{
		System.out.print(num);
		return num;
	}
}



public class O21 {
	
	public static void main(String[] args)
	{
		PrintNumber pn = new PrintNumber();
		
		pn.printn(10);
		pn.printn(12.56);
		pn.printn(21.565656);
			
	}

}
