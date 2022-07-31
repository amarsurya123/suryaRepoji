package collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class linkedHashSetStudy {

	public static void main(String[] args) 
	{
		LinkedHashSet lt=new LinkedHashSet();
		
		lt.add(12);
		lt.add("amar");
		lt.add("amar suryawanshi");
		lt.add(13.2);
		lt.add('D');
		lt.add(null);
		lt.add('F');
		System.out.println(lt);
		System.out.println(lt.size());
		System.out.println(lt.contains('D'));
		System.out.println("==============");
		
		Iterator ls = lt.iterator();
		while(ls.hasNext())
		{
			System.out.println(ls.next());
		}
	}

}
