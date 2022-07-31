package collection;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetStudy {

	public static void main(String[] args) 
	{
     
		HashSet st=new HashSet();
		st.add("amar surya");
		st.add("amar");
		st.add('S');
		st.add(12);
		st.add(22.3);
		st.add('D');
		st.add(null);
		st.add(null);
		System.out.println(st);
		System.out.println(st.size());
		System.out.println(st.contains(12));
		System.out.println(st.remove(1));
		System.out.println("==========");
	    
		Iterator s2 = st.iterator();
		while(s2.hasNext())
		{
			System.out.println(s2.next());
		}
		
	}

}
