import java.util.ArrayList;
import java.util.Iterator;

public class O53 {
	
	public static void main(String[] args) {
		
		ArrayList<String> st = new ArrayList<String>();
		
		st.add("Rathod");
		st.add("Janak");
		st.add("Dhaduk");
		st.add("Mayank");
		st.add("Dixit");
		st.add("Tagadiya");
		
		
		st.remove(2);
		
		Iterator<String> res = st.iterator();
		
		while(res.hasNext())
		{
			System.out.println(res.next());
		}
		
	}

}
