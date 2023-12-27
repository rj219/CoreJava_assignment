class Member
{	
	String meber = "1";
	String name = "Janak Rathod";
	int age = 25;
	String Add = "Surat,Gujrat";
	double phone_number = 9898068132l;
	int salary = 750000;
	
	public void print_salary()
	{
		System.out.println("Salary of the user is :"+ salary);	
	}
}

public class O25 {
	
	public static void main(String[] args) 
	{	
		Member men = new Member();
		
		men.print_salary();
	}

}
