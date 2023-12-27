abstract class Bank
{
	int A = 100;
	int B = 150;
	int c = 200;
	public abstract void getBalance();
}
class Bank_a extends Bank
{
	public void getBalance()
	{
		System.out.println(A + " $ Diposited Successfully");
	}
}
class Bank_b extends Bank_a
{
	
	public void getBalance()
	{
		System.out.println(B + " $ Diposited Successfully");
	}
}
class Bank_c extends Bank_b
{
	public void getBalance()
	{
		System.out.println(c + " $ Diposited Successfully");
	}
}
public class O31 {
	
	public static void main(String[] args) {
		
		Bank_a a = new Bank_a();
		
		a.getBalance();
		
		Bank_b b = new Bank_b();
		
		b.getBalance();
		
		Bank_c c = new Bank_c();
		
		c.getBalance();
	
		
		
		
		
	}

}
