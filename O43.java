import java.util.Scanner;

class BalanceException extends Exception
{
	int balance;
	 public BalanceException(int balance)
	{
		this.balance = balance;
	}
	public void toShow()
	{
		System.out.println("Sorry...Insuffiecient Balance.....need "+balance+"Rs. to perform this transection");
	}
}

class Withdraw
{
	int amount;
	public void toWithdraw(int amount) throws BalanceException
	{
		if (amount > 2000)
		{
			int balance = amount - 2000;
			throw new BalanceException(balance);
		}
		else
		{
			System.out.println("Withdrawn Successfully.......");
		}
	}
}
public class O43 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the amount to withdraw : ");
		int amt = in.nextInt();
		Withdraw wtf = new Withdraw();
		
		try
		{
			wtf.toWithdraw(amt);
		} 
		catch (BalanceException e) 
		{
			e.printStackTrace();
			e.toShow();
		}
		in.close();
		
	}

}
