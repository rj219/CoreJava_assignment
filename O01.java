import java.util.Scanner;

public class O01 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter three values : ");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		
		
	int result = (a > b && a > c) ? a : (b > c && b > a) ? b : +  c ;
		
		System.out.println(result);
	}

}
