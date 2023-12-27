import java.util.Scanner;

public class O41 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value : ");
		
		int n[] = new int[3];
		int i=0;
		for(i=0; i<=3; i++)
		{
			try
			{
				n[i]=in.nextInt();
				//n[1]/=0;
			}
			catch (ArrayIndexOutOfBoundsException e) 
			{
					e.printStackTrace();
					System.out.println(n[1]);
			}
			catch(ArithmeticException e)
			{
				e.printStackTrace();
				System.out.println("OK");
			}
		
		}
		in.close();
	}
}
