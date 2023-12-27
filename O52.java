import java.util.ArrayList;
import java.util.Iterator;

public class O52 {
	
	public static void main(String[] args) {
		
		ArrayList<String> in = new ArrayList<String>();
		
		in.add("Janak");
		in.add("Arun");
		in.add("Mayank");
		in.add("Dixit");
		in.add("Sahil");
		
		in.add(0,"Rathod");
		
//		in.addFirst("Rathod");
		
		Iterator<String> str = in.iterator();
		while(str.hasNext())
		{
			System.out.println(str.next());
		}
		
		
	}

}
