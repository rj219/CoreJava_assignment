import java.util.Scanner;

public class O11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value : ");
		int n = sc.nextInt();
		
		System.out.println(n +" "+(n*10+n)+" "+(n*100+n*10+n));
		
	}

}
