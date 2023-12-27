class AgenotWithinRangeException extends Exception
{
	int Age;
	public AgenotWithinRangeException(int Age)
	{
		this.Age = Age;
	}
	public void toShoww()
	{
		System.out.println("Age is not valid.....Kindly input valid AGE");
	}
}

class NamenotValidException extends Exception
{
	String Name;
	public NamenotValidException(String Name)
	{	
		this.Name = Name;
	}
	public void toName()
	{
		System.out.println("Name contain some special character or number please enter in correct format...");
	}
}

class Student 
{
	int age;
	String name;
	String course;
	Student(int age, String name, String course)
	{
		this.age = age;
		this.name = name;
		this.course = course;
	}
	public void toAgg() throws AgenotWithinRangeException
	{
		int Age=0;
		if (age > 15 && age < 21)
		{
			System.out.println("Valid age...");
		}
		else
		{
			throw new AgenotWithinRangeException(Age);
		}
	}
	
	public void toName() throws NamenotValidException
	{
		for(int i=0;i<name.length();i++)
		{
			if(!Character.isLetter(name.charAt(i)) && !Character.isWhitespace(name.charAt(i)))
			{
				throw new NamenotValidException(name);
			}
		}
		System.out.println("Valid Name.......");
	}
	
}
public class O44 {
	
	public static void main(String[] args) {
		
		
		Student st = new Student(19, "Janak@", "Full-Stack");
		try
		{
			st.toAgg();
			st.toName();
		} 
		catch (AgenotWithinRangeException e)
		{
			e.printStackTrace();
			e.toShoww();
		}
		catch(NamenotValidException e)
		{
			e.printStackTrace();
			e.toName();
		}	
	}
}
