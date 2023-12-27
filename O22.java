class NumCharc
{
	public void toDisplay(int a, char b)
	{
		System.out.println(a + " "+ b);
	}
	public void toDisplay(char a, int b)
	{
		System.out.println(a+" "+b);
	}
}

public class O22 {
	
	public static void main(String[] args) 
	{
		
		NumCharc np = new NumCharc();
		
		np.toDisplay(21, 'J');
		np.toDisplay('N', 11);
		
	}

}
