package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedListStudy {

	public static void main(String[] args) 
	{
		LinkedList ls =new LinkedList();
		ls.add("amar surya");
		ls.add("amar");
		ls.add(11);
		ls.add(21.3);
		ls.add('D');
		ls.add(null);
		ls.add('S');
		ls.add('S');
		
		System.out.println(ls);
		System.out.println("=====1=====");
		System.out.println(ls.size());
		System.out.println(ls.contains(11));
		System.out.println(ls.indexOf(11));
		
		System.out.println("using iterator corsar");  
		Iterator it = ls.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("using listiterator corsar");
		ListIterator lt = ls.listIterator();
		while(lt.hasNext())
		{
			System.out.println(lt.next());
		}
		System.out.println("============");
		System.out.println("using for loop corsor");
		for(int i=0;i<=ls.size()-1;i++)
		{
			System.out.println(ls.get(i));
		}
		System.out.println("using listiterator cursor(previous)");
		while(lt.hasPrevious())
		{
			System.out.println(lt.previous());
		}
	}
}
