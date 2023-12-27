import java.util.Scanner;

class Result
{
	public int toResult()
	{
		Scanner in = new Scanner(System.in);
		int a[] = new int[5];
		for (int i=0; i<5; i++)
		{
			System.out.println("Enter the Marks of 5 subject out of 100 : ");
			a[i] = in.nextInt();
		}
		
		int sum =0;
		for(int i : a)
		{
			sum +=i;
		}
		
		int avg = sum/5;
		
		if(avg > 90)
		{
			System.out.println("Passed with A Grade");
		}
		else if(avg > 70 && avg < 90)
		{
			System.out.println("Passed with B Grade");
		}
		else if(avg > 60 && avg < 70)
		{
			System.out.println("Passed with C Grade");
		}
		else if(avg > 50 && avg < 60)
		{
			System.out.println("Passed with D Grade");
		}
		else if(avg > 41 && avg < 50)
		{
			System.out.println("Passed with DD Grade");
		}
		else
		{
			System.out.println(" Fail......Bettre luck next time!!!!!!!!");
		}
		
		return avg;
	}
}
public class O37 {
	
	public static void main(String[] args) 
	{
		Result r = new Result();
		
		System.out.println(r.toResult());
		
	}

}
