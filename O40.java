import java.util.Scanner;

public class O40 {
	
public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = in.nextInt();
		System.out.println("Enter the number : ");
		int b = in.nextInt();
		
		int ans=0;
		try
		{
			 ans = a / b;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}

		System.out.println(ans);
		
		
	}


}
