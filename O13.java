import java.util.Scanner;

public class O13 {
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value : ");
		int n = sc.nextInt();
		int i;
		for ( i=1; i<=n; i++)
		{
			if (i%3==0)
			{
				System.out.println("Divisible by 3"+" "+i);
				
			}
			else if (i%5==0)
			{
				System.out.println("Divisible by 5"+" "+i);				
			}
		}
	}

}
