import java.util.Scanner;

class AgeException extends Exception
{
	int age;
	public  AgeException(int age)
	{
		this.age = age;
	}
	public void toage()
	{
		System.err.println("18 years should be comleted to Vote...." + age+" Yeas remaining.....");
	}
}



class AgeValidation 
{
	public void vote(int Age) throws AgeException
	{
		if (Age < 18)
		{
			int age = 18 - Age;
			throw new AgeException(age);
		}
		else
		{
			System.out.println("Eligible for votting.......");
		}
	}
}

public class O42 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the age : ");
		int ag = in.nextInt();
		
		AgeValidation Ag = new AgeValidation();
		
		try {
			Ag.vote(ag);
			} 
		catch (AgeException e) 
		{
			e.printStackTrace();
			e.toage();
		}
		
		in.close();
		
	}

}
