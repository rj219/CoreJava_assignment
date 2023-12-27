abstract class Par_ent
{
//	public abstract void message();
}

class Chi_ld extends Par_ent
{
//	public void messae()
//	{
//		System.out.println("---This is a parent calss---");
//	}
	public void message()
	{
		System.out.println("---This is a first sub-Class--");
	}
}

class Grand_child extends Chi_ld
{
	public void message()
	{
		System.out.println("---This is a second sub-Class---");
	}
}
public class O30 {
	
	public static void main(String[] args)
	{
		
		Chi_ld ch = new Chi_ld();
		
//		ch.messae();
		ch.message();
		
		Grand_child gc = new Grand_child();

		gc.message();
		
		
	}

}
