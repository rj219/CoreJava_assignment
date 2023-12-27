import java.util.Scanner;

public class O19 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String st = sc.nextLine();
		
		char a[]= st.toCharArray();
		
		for(int i=0; i<=a.length-1; i++)
		{
			System.out.println(a[i]);			
		}
		
		
	}

}
