import java.util.Scanner;

class Fact
{
	public int Fact_rec(int n)
	{
		if(n == 1 || n == 0)
		{
			return n;
		}
		else
		{
			return (n*Fact_rec(n-1));
		}
	}
}
public class O33 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Fact fact = new Fact();
		
		System.out.println("Enter the value : ");
		int  num = sc.nextInt();
		
		System.out.println(fact.Fact_rec(num));
		
	}

}
