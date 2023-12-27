import java.util.Scanner;

public class O08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an Integer : ");
		int num = sc.nextInt();
		int count = 0;
		
		
		while(num!=0)
		{
			int rem = num%10;
			num = num/10;
			count++;
		}
		
		System.out.println(count);
		
	}
}
