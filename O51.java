import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class O51 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> it = new ArrayList<Integer>();
		
		it.add(1);
		it.add(2);
		it.add(3);
		it.add(4);
		it.add(5);
		it.add(6);
		it.add(7);
		it.add(8);
		it.add(9);
		it.add(10);
		
		
		
		Iterator<Integer> in = it.iterator();
		while(in.hasNext())
		{
			System.out.println(in.next());
		}
		
	}
	
}
