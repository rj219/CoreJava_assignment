import java.util.Scanner;

public class O02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character : ");
		char ch = sc.next().charAt(0);
		
		if(Character.isDigit(ch))
		{
			System.out.println("Invalid input");
			
		}
		else
		{
		
		if (ch == 'A'|| ch == 'a'||ch == 'I' || ch == 'i' || ch == 'O' || ch == 'O'|| ch == 'E'||ch == 'e'||ch == 'U'|| ch == 'u')
		{
			System.out.println("The Entered chracter is Vowel");
		}
		else 
		{
			System.out.println("The Entered Character is consonent");
		}
		
		}
		
		
		
	}

}
