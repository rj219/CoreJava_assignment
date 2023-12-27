import java.util.Scanner;
public class O03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value : ");
		
		int year = sc.nextInt();
		
		if(year%4==0)
		{
			System.out.println("Enterd Year is Leap Year");
		}
		else
		{
			System.out.println("Entered Year is Non-Leap Year");
		}
	}
	
}
