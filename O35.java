import java.util.Scanner;
class Fact_1
{
	public int toFact(int n)
	{
		int Fact = 1;
		
		for (int i=1; i<=n; i++)
		{
			Fact = Fact*i;
		}
			return Fact;
	}
}
public class O35 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Fact_1 fc = new Fact_1();
		
		System.out.println("Enter the num : ");
		int num = in.nextInt();
		
		System.out.println(fc.toFact(num));
		
	}

}
