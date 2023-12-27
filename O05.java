import java.util.Scanner;

public class O05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of A : ");
		int a = sc.nextInt();
		System.out.println("Enter the value of B : ");
		int b = sc.nextInt();
		System.out.println("Enter the value of C : ");
		int c = sc.nextInt();
		System.out.println("Enter the value of D : ");
		int d = sc.nextInt();
		System.out.println("Enter the value of E : ");
		int e = sc.nextInt();
		
		int sum = a+b+c+d+e;
		
		System.out.println(sum);
		
		int avg = sum*100/500;
		
		System.out.println("The average of sum is : " + avg);
	}

}
